package lxb;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import com.revolut.feature.insurance_pet.impl.ui.profile.help.PetGetHelpActivity;
import efm.h0;
import efm.w;
import ip0.um0;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import li8.n;
import m1c.g1;
import m1c.h1;
import pfm.m;
import x3g.i;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements o, g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f200544b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f200543a = i;
        this.f200544b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((ly2.b) this.f200544b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f200543a;
        m mVar = m.f235744a;
        Function1 function1 = this.f200544b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g1) ((lv9.c) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h1) ((lv9.c) function1).invoke(p0);
            case 2:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((lyd.b) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ly2.b) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ly2.b) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((lv9.c) function1).invoke(p0);
                return mVar;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lul.d) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ly2.b) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((lv9.c) function1).invoke(p0);
                return mVar;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ly2.b) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ly2.b) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((ly2.b) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((ly7.d) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PetEditDetailsContract$PetEditResult) ((ly7.d) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ly7.d) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((ly7.d) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((n) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((lul.d) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((lv9.c) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((lul.d) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((lyd.b) function1).invoke(p0);
            case 21:
                int i2 = PetGetHelpActivity.f76392x0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (um0) ((lyd.b) function1).invoke(p0);
            case 22:
                int i3 = PetGetHelpActivity.f76392x0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (um0) ((lyd.b) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((lyd.b) function1).invoke(p0);
            case 25:
                return (efm.f) ((lu5.o) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) ((lu5.o) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (myf.a) ((lyd.b) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d0g.a) ((lyd.b) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        lyd.b bVar = (lyd.b) this.f200544b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) bVar.invoke(p0)).booleanValue();
    }
}
