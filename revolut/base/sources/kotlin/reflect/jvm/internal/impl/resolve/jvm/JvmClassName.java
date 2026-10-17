package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import ch.qos.logback.core.CoreConstants;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class JvmClassName {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187599a;

    public JvmClassName(String str) {
        if (str != null) {
            this.f187599a = str;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.a(int):void");
    }

    @NotNull
    public static JvmClassName byClassId(@NotNull ClassId classId) {
        if (classId != null) {
            return new JvmClassName(internalNameByClassId(classId));
        }
        a(1);
        throw null;
    }

    @NotNull
    public static JvmClassName byFqNameWithoutInnerClasses(@NotNull FqName fqName) {
        if (fqName != null) {
            return new JvmClassName(fqName.asString().replace(CoreConstants.DOT, '/'));
        }
        a(4);
        throw null;
    }

    @NotNull
    public static JvmClassName byInternalName(@NotNull String str) {
        if (str != null) {
            return new JvmClassName(str);
        }
        a(0);
        throw null;
    }

    @NotNull
    public static String internalNameByClassId(@NotNull ClassId classId) {
        if (classId == null) {
            a(2);
            throw null;
        }
        FqName packageFqName = classId.getPackageFqName();
        String strReplace = classId.getRelativeClassName().asString().replace(CoreConstants.DOT, CoreConstants.DOLLAR);
        if (!packageFqName.isRoot()) {
            strReplace = packageFqName.asString().replace(CoreConstants.DOT, '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        a(3);
        throw null;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        return this.f187599a.equals(((JvmClassName) obj2).f187599a);
    }

    @NotNull
    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.f187599a.replace('/', CoreConstants.DOT));
    }

    @NotNull
    public String getInternalName() {
        String str = this.f187599a;
        if (str != null) {
            return str;
        }
        a(10);
        throw null;
    }

    @NotNull
    public FqName getPackageFqName() {
        String str = this.f187599a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new FqName(str.substring(0, iLastIndexOf).replace('/', CoreConstants.DOT));
        }
        FqName fqName = FqName.ROOT;
        if (fqName != null) {
            return fqName;
        }
        a(9);
        throw null;
    }

    public int hashCode() {
        return this.f187599a.hashCode();
    }

    public String toString() {
        return this.f187599a;
    }
}
