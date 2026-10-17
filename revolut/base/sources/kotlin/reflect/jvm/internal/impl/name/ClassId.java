package kotlin.reflect.jvm.internal.impl.name;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes13.dex */
public final class ClassId {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f187460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FqName f187461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187462c;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ ClassId fromString$default(Companion companion, String str, boolean z, int i, Object obj2) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.fromString(str, z);
        }

        @NotNull
        public final ClassId fromString(@NotNull String string, boolean z) {
            String strD;
            Intrinsics.checkNotNullParameter(string, "string");
            int iS = d0.S(string, '`', 0, 6);
            if (iS == -1) {
                iS = string.length();
            }
            int iY = d0.Y(string, "/", iS, 4);
            String str = "";
            if (iY == -1) {
                strD = a0.D(string, "`", "", false);
            } else {
                String strSubstring = string.substring(0, iY);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strE = a0.E(strSubstring, '/', CoreConstants.DOT);
                String strSubstring2 = string.substring(iY + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strD = a0.D(strSubstring2, "`", "", false);
                str = strE;
            }
            return new ClassId(new FqName(str), new FqName(strD), z);
        }

        @NotNull
        public final ClassId topLevel(@NotNull FqName topLevelFqName) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            return new ClassId(topLevelFqName.parent(), topLevelFqName.shortName());
        }
    }

    public ClassId(@NotNull FqName packageFqName, @NotNull FqName relativeClassName, boolean z) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        this.f187460a = packageFqName;
        this.f187461b = relativeClassName;
        this.f187462c = z;
        relativeClassName.isRoot();
    }

    public static final String a(FqName fqName) {
        String strAsString = fqName.asString();
        return d0.K(strAsString, '/') ? a.l('`', "`", strAsString) : strAsString;
    }

    @NotNull
    public static final ClassId topLevel(@NotNull FqName fqName) {
        return Companion.topLevel(fqName);
    }

    @NotNull
    public final FqName asSingleFqName() {
        FqName fqName = this.f187460a;
        boolean zIsRoot = fqName.isRoot();
        FqName fqName2 = this.f187461b;
        if (zIsRoot) {
            return fqName2;
        }
        return new FqName(fqName.asString() + CoreConstants.DOT + fqName2.asString());
    }

    @NotNull
    public final String asString() {
        FqName fqName = this.f187460a;
        boolean zIsRoot = fqName.isRoot();
        FqName fqName2 = this.f187461b;
        if (zIsRoot) {
            return a(fqName2);
        }
        return a0.E(fqName.asString(), CoreConstants.DOT, '/') + "/" + a(fqName2);
    }

    @NotNull
    public final ClassId createNestedClassId(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ClassId(this.f187460a, this.f187461b.child(name), this.f187462c);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj2;
        return Intrinsics.f(this.f187460a, classId.f187460a) && Intrinsics.f(this.f187461b, classId.f187461b) && this.f187462c == classId.f187462c;
    }

    public final ClassId getOuterClassId() {
        FqName fqNameParent = this.f187461b.parent();
        if (fqNameParent.isRoot()) {
            return null;
        }
        return new ClassId(this.f187460a, fqNameParent, this.f187462c);
    }

    @NotNull
    public final FqName getPackageFqName() {
        return this.f187460a;
    }

    @NotNull
    public final FqName getRelativeClassName() {
        return this.f187461b;
    }

    @NotNull
    public final Name getShortClassName() {
        return this.f187461b.shortName();
    }

    public int hashCode() {
        return Boolean.hashCode(this.f187462c) + ((this.f187461b.hashCode() + (this.f187460a.hashCode() * 31)) * 31);
    }

    public final boolean isLocal() {
        return this.f187462c;
    }

    public final boolean isNestedClass() {
        return !this.f187461b.parent().isRoot();
    }

    @NotNull
    public String toString() {
        if (!this.f187460a.isRoot()) {
            return asString();
        }
        return "/" + asString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(@NotNull FqName packageFqName, @NotNull Name topLevelName) {
        this(packageFqName, FqName.Companion.topLevel(topLevelName), false);
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
    }
}
