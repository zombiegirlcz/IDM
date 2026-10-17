package kotlin.reflect.jvm.internal.impl.name;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class FqNameUnsafe {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final Name e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient FqName f187466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient FqNameUnsafe f187467c;
    public transient Name d;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final FqNameUnsafe topLevel(@NotNull Name shortName) {
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            String strAsString = shortName.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            return new FqNameUnsafe(strAsString, FqName.ROOT.toUnsafe(), shortName, null);
        }
    }

    static {
        Name nameSpecial = Name.special("<root>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(...)");
        e = nameSpecial;
        Intrinsics.checkNotNullExpressionValue(Pattern.compile("\\."), "compile(...)");
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    public static final List b(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.isRoot()) {
            return new ArrayList();
        }
        List listB = b(fqNameUnsafe.parent());
        listB.add(fqNameUnsafe.shortName());
        return listB;
    }

    public final void a() {
        String str = this.f187465a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.d = Name.guessByFirstCharacter(str);
            this.f187467c = FqName.ROOT.toUnsafe();
            return;
        }
        String strSubstring = str.substring(length + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        this.d = Name.guessByFirstCharacter(strSubstring);
        String strSubstring2 = str.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        this.f187467c = new FqNameUnsafe(strSubstring2);
    }

    @NotNull
    public final String asString() {
        return this.f187465a;
    }

    @NotNull
    public final FqNameUnsafe child(@NotNull Name name) {
        String strAsString;
        Intrinsics.checkNotNullParameter(name, "name");
        if (isRoot()) {
            strAsString = name.asString();
        } else {
            strAsString = this.f187465a + CoreConstants.DOT + name.asString();
        }
        Intrinsics.h(strAsString);
        return new FqNameUnsafe(strAsString, this, name);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof FqNameUnsafe) {
            return Intrinsics.f(this.f187465a, ((FqNameUnsafe) obj2).f187465a);
        }
        return false;
    }

    public int hashCode() {
        return this.f187465a.hashCode();
    }

    public final boolean isRoot() {
        return this.f187465a.length() == 0;
    }

    public final boolean isSafe() {
        return this.f187466b != null || d0.S(asString(), '<', 0, 6) < 0;
    }

    @NotNull
    public final FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.f187467c;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        a();
        FqNameUnsafe fqNameUnsafe2 = this.f187467c;
        Intrinsics.h(fqNameUnsafe2);
        return fqNameUnsafe2;
    }

    @NotNull
    public final List<Name> pathSegments() {
        return b(this);
    }

    @NotNull
    public final Name shortName() {
        Name name = this.d;
        if (name != null) {
            return name;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        a();
        Name name2 = this.d;
        Intrinsics.h(name2);
        return name2;
    }

    @NotNull
    public final Name shortNameOrSpecial() {
        return isRoot() ? e : shortName();
    }

    public final boolean startsWith(@NotNull Name segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (!isRoot()) {
            String str = this.f187465a;
            int iS = d0.S(str, CoreConstants.DOT, 0, 6);
            if (iS == -1) {
                iS = str.length();
            }
            int i = iS;
            String strAsString = segment.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            if (i == strAsString.length() && a0.B(this.f187465a, 0, false, strAsString, 0, i)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final FqName toSafe() {
        FqName fqName = this.f187466b;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f187466b = fqName2;
        return fqName2;
    }

    @NotNull
    public String toString() {
        if (!isRoot()) {
            return this.f187465a;
        }
        String strAsString = e.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }

    public FqNameUnsafe(@NotNull String fqName, @NotNull FqName safe) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(safe, "safe");
        this.f187465a = fqName;
        this.f187466b = safe;
    }

    public FqNameUnsafe(@NotNull String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f187465a = fqName;
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.f187465a = str;
        this.f187467c = fqNameUnsafe;
        this.d = name;
    }
}
