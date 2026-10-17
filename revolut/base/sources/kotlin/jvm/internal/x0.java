package kotlin.jvm.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/jvm/internal/x0;", "Lkotlin/reflect/KType;", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x0 implements KType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wim.c f186441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KType f186443c;
    public final int d;

    /* JADX INFO: renamed from: kotlin.jvm.internal.x0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/x0$a;", "", "", "IS_MARKED_NULLABLE", "I", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public x0(wim.c classifier, List arguments, KType kType, int i) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f186441a = classifier;
        this.f186442b = arguments;
        this.f186443c = kType;
        this.d = i;
    }

    public final String a(boolean z) {
        String name;
        wim.c cVar = this.f186441a;
        KClass kClass = cVar instanceof KClass ? (KClass) cVar : null;
        Class clsO = kClass != null ? nim.a.o(kClass) : null;
        if (clsO == null) {
            name = cVar.toString();
        } else if ((this.d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsO.isArray()) {
            name = clsO.equals(boolean[].class) ? "kotlin.BooleanArray" : clsO.equals(char[].class) ? "kotlin.CharArray" : clsO.equals(byte[].class) ? "kotlin.ByteArray" : clsO.equals(short[].class) ? "kotlin.ShortArray" : clsO.equals(int[].class) ? "kotlin.IntArray" : clsO.equals(float[].class) ? "kotlin.FloatArray" : clsO.equals(long[].class) ? "kotlin.LongArray" : clsO.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z && clsO.isPrimitive()) {
            Intrinsics.i(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = nim.a.p((KClass) cVar).getName();
        } else {
            name = clsO.getName();
        }
        List list = this.f186442b;
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(name, list.isEmpty() ? "" : zhm.d0.k0(list, ", ", "<", ">", 0, new kog.k(this, 2), 24), h() ? "?" : "");
        KType kType = this.f186443c;
        if (!(kType instanceof x0)) {
            return strO;
        }
        String strA = ((x0) kType).a(true);
        if (Intrinsics.f(strA, strO)) {
            return strO;
        }
        if (Intrinsics.f(strA, strO + '?')) {
            return strO + '!';
        }
        return "(" + strO + ".." + strA + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final KType getF186443c() {
        return this.f186443c;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f186441a, x0Var.f186441a) && Intrinsics.f(this.f186442b, x0Var.f186442b) && Intrinsics.f(this.f186443c, x0Var.f186443c) && this.d == x0Var.d;
    }

    @Override // wim.b
    public final List getAnnotations() {
        return zhm.f0.f322471a;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getArguments, reason: from getter */
    public final List getF186442b() {
        return this.f186442b;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getClassifier, reason: from getter */
    public final wim.c getF186441a() {
        return this.f186441a;
    }

    @Override // kotlin.reflect.KType
    public final boolean h() {
        return (this.d & 1) != 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.d(this.f186441a.hashCode() * 31, 31, this.f186442b);
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x0(wim.c classifier, List arguments, boolean z) {
        this(classifier, arguments, null, z ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }
}
