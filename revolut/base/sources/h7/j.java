package h7;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableState f149792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f149793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState f149794c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableState f149795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final State f149796h;
    public final MutableState i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableState f149797j;
    public final MutableState k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableState f149798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final State f149799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final State f149800n;
    public final MutatorMutex o;

    public j() {
        Boolean bool = Boolean.FALSE;
        this.f149792a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f149793b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.f149794c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        this.f149795g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f149796h = SnapshotStateKt.derivedStateOf(new h(this, 1));
        this.i = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.f149797j = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.k = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.f149798l = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.f149799m = SnapshotStateKt.derivedStateOf(new h(this, 0));
        this.f149800n = SnapshotStateKt.derivedStateOf(new h(this, 2));
        this.o = new MutatorMutex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(j jVar, int i, long j2) {
        d7.j jVarD = jVar.d();
        MutableState mutableState = jVar.f149797j;
        State state = jVar.f149796h;
        MutableState mutableState2 = jVar.f149798l;
        if (jVarD == null) {
            return true;
        }
        long jLongValue = ((Number) mutableState2.getValue()).longValue() == Long.MIN_VALUE ? 0L : j2 - ((Number) mutableState2.getValue()).longValue();
        mutableState2.setValue(Long.valueOf(j2));
        u uVarC = jVar.c();
        float fB = uVarC != null ? uVarC.b(jVarD) : 0.0f;
        u uVarC2 = jVar.c();
        float fA = uVarC2 != null ? uVarC2.a(jVarD) : 1.0f;
        float fB2 = ((jLongValue / ((long) 1000000)) / jVarD.b()) * ((Number) state.getValue()).floatValue();
        float fFloatValue = ((Number) state.getValue()).floatValue() < BitmapDescriptorFactory.HUE_RED ? fB - (((Number) mutableState.getValue()).floatValue() + fB2) : (((Number) mutableState.getValue()).floatValue() + fB2) - fA;
        if (fB == fA) {
            jVar.i(fB);
            return false;
        }
        if (fFloatValue < BitmapDescriptorFactory.HUE_RED) {
            jVar.i(kotlin.ranges.f.f(((Number) mutableState.getValue()).floatValue(), fB, fA) + fB2);
            return true;
        }
        float f = fA - fB;
        int i2 = (int) (fFloatValue / f);
        int i3 = i2 + 1;
        if (jVar.e() + i3 > i) {
            jVar.i(((Number) jVar.f149799m.getValue()).floatValue());
            jVar.h(i);
            return false;
        }
        jVar.h(jVar.e() + i3);
        float f4 = fFloatValue - (i2 * f);
        jVar.i(((Number) state.getValue()).floatValue() < BitmapDescriptorFactory.HUE_RED ? fA - f4 : fB + f4);
        return true;
    }

    public static final void b(j jVar, boolean z) {
        jVar.f149792a.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u c() {
        return (u) this.e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d7.j d() {
        return (d7.j) this.i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        return ((Number) this.f149793b.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float f() {
        return ((Number) this.k.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float g() {
        return ((Number) this.f.getValue()).floatValue();
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return Float.valueOf(f());
    }

    public final void h(int i) {
        this.f149793b.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(float f) {
        d7.j jVarD;
        this.f149797j.setValue(Float.valueOf(f));
        if (((Boolean) this.f149795g.getValue()).booleanValue() && (jVarD = d()) != null) {
            f -= f % (1 / jVarD.f111685n);
        }
        this.k.setValue(Float.valueOf(f));
    }
}
