package hb4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f150598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f150599b;

    public e(ax4.b constructorState, Data familyCreditCardSettingsData) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(familyCreditCardSettingsData, "familyCreditCardSettingsData");
        this.f150598a = constructorState;
        this.f150599b = familyCreditCardSettingsData;
    }

    public static e a(e eVar, ax4.b constructorState, Data familyCreditCardSettingsData, int i) {
        if ((i & 1) != 0) {
            constructorState = eVar.f150598a;
        }
        if ((i & 2) != 0) {
            familyCreditCardSettingsData = eVar.f150599b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(familyCreditCardSettingsData, "familyCreditCardSettingsData");
        return new e(constructorState, familyCreditCardSettingsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f150598a, eVar.f150598a) && Intrinsics.f(this.f150599b, eVar.f150599b);
    }

    public final int hashCode() {
        return this.f150599b.hashCode() + (this.f150598a.hashCode() * 31);
    }
}
