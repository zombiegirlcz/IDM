package skm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f264008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f264009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f264010c;
    public final Object d;
    public final Throwable e;

    public t(Object obj2, k kVar, Function3 function3, Object obj3, Throwable th10) {
        this.f264008a = obj2;
        this.f264009b = kVar;
        this.f264010c = function3;
        this.d = obj3;
        this.e = th10;
    }

    public static t a(t tVar, k kVar, Throwable th10, int i) {
        Object obj2 = tVar.f264008a;
        if ((i & 2) != 0) {
            kVar = tVar.f264009b;
        }
        k kVar2 = kVar;
        Function3 function3 = tVar.f264010c;
        Object obj3 = tVar.d;
        if ((i & 16) != 0) {
            th10 = tVar.e;
        }
        return new t(obj2, kVar2, function3, obj3, th10);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f264008a, tVar.f264008a) && Intrinsics.f(this.f264009b, tVar.f264009b) && Intrinsics.f(this.f264010c, tVar.f264010c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e);
    }

    public final int hashCode() {
        Object obj2 = this.f264008a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        k kVar = this.f264009b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Function3 function3 = this.f264010c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj3 = this.d;
        int iHashCode4 = (iHashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Throwable th10 = this.e;
        return iHashCode4 + (th10 != null ? th10.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f264008a + ", cancelHandler=" + this.f264009b + ", onCancellation=" + this.f264010c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ t(Object obj2, k kVar, Function3 function3, Throwable th10, int i) {
        this(obj2, (i & 2) != 0 ? null : kVar, (i & 4) != 0 ? null : function3, (Object) null, (i & 16) != 0 ? null : th10);
    }
}
