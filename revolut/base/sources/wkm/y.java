package wkm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import vkm.z1;

/* JADX INFO: loaded from: classes13.dex */
public final class y extends z1 implements StateFlow {
    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f290161h;
            Intrinsics.h(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.i + ((long) ((int) ((q() + ((long) this.k)) - this.i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.f290161h;
            Intrinsics.h(objArr);
            k(Integer.valueOf(((Number) objArr[((int) ((this.i + ((long) ((int) ((q() + ((long) this.k)) - this.i)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
