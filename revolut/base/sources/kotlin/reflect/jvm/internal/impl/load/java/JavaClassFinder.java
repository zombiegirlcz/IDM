package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface JavaClassFinder {
    JavaClass findClass(@NotNull Request request);

    JavaPackage findPackage(@NotNull FqName fqName, boolean z);

    Set<String> knownClassNamesInPackage(@NotNull FqName fqName);

    public static final class Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClassId f186865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f186866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JavaClass f186867c;

        public Request(@NotNull ClassId classId, byte[] bArr, JavaClass javaClass) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f186865a = classId;
            this.f186866b = bArr;
            this.f186867c = javaClass;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Request)) {
                return false;
            }
            Request request = (Request) obj2;
            return Intrinsics.f(this.f186865a, request.f186865a) && Intrinsics.f(this.f186866b, request.f186866b) && Intrinsics.f(this.f186867c, request.f186867c);
        }

        @NotNull
        public final ClassId getClassId() {
            return this.f186865a;
        }

        public int hashCode() {
            int iHashCode = this.f186865a.hashCode() * 31;
            byte[] bArr = this.f186866b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f186867c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(classId=" + this.f186865a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f186866b) + ", outerClass=" + this.f186867c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : javaClass);
        }
    }
}
