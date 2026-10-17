package nf4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f214805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f214806b;

    public e() {
        this(0);
    }

    public static e a(e eVar, ax4.b constructorState, Data calculatorStateData, int i) {
        if ((i & 1) != 0) {
            constructorState = eVar.f214805a;
        }
        if ((i & 2) != 0) {
            calculatorStateData = eVar.f214806b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(calculatorStateData, "calculatorStateData");
        return new e(constructorState, calculatorStateData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f214805a, eVar.f214805a) && Intrinsics.f(this.f214806b, eVar.f214806b);
    }

    public final int hashCode() {
        return this.f214806b.hashCode() + (this.f214805a.hashCode() * 31);
    }

    public e(ax4.b constructorState, Data calculatorStateData) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(calculatorStateData, "calculatorStateData");
        this.f214805a = constructorState;
        this.f214806b = calculatorStateData;
    }

    public /* synthetic */ e(int i) {
        this(new ax4.b(0), new Data(null, null, true, 3, null));
    }
}
