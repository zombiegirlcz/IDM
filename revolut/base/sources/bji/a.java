package bji;

import bi2.g;
import com.revolut.RevolutApplication;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import f8.f;
import fa1.k;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lwl.e;
import rd0.c;
import rd0.d;
import y8.l;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15674a;

    public /* synthetic */ a(int i) {
        this.f15674a = i;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f15674a) {
            case 0:
                Unit unit = Unit.f186387a;
                return;
            case 1:
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.b(c.VERBOSE, "ConfigurationInteractorImpl", "USER CONFIG LOADED", null, null, 16);
                return;
            case 2:
                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                d.b(c.VERBOSE, "ConfigurationInteractorImpl", "COMMON CONFIG LOADED", null, null, 16);
                return;
            case 3:
                e.k = true;
                return;
            case 4:
                ea1.b.a("Terminal has been moved to READY state", k.INFO);
                return;
            case 5:
                ea1.b.a("Card reader was successfully updated", k.INFO);
                return;
            case 6:
                gom.c cVar = gom.e.f145194a;
                cVar.f("LogoutCleaner");
                cVar.d("============== LOGOUT ===============", new Object[0]);
                RevolutApplication.INSTANCE.getClass();
                RevolutApplication revolutApplication = RevolutApplication.A;
                if (revolutApplication == null) {
                    Intrinsics.r("sInstance");
                    throw null;
                }
                com.bumptech.glide.b bVarA = com.bumptech.glide.b.a(revolutApplication);
                bVarA.getClass();
                l.a();
                bVarA.f26074c.e(0L);
                bVarA.f26073b.e();
                f fVar = bVarA.e;
                synchronized (fVar) {
                    fVar.b(0);
                }
                return;
            case 7:
                ea1.b.a("BLE FW has been successfully installed", k.INFO);
                return;
            case 8:
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parcel must contain prompt info!");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = d.f253311a;
                d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
                return;
            case 9:
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("AllSavingsWidget model should have TransferWidgetParcel");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = d.f253311a;
                d.a(c.ERROR, null, null, illegalArgumentException2, h0Var2);
                return;
            case 10:
                SignSmsStepFragment.Companion aVar = SignSmsStepFragment.INSTANCE;
                return;
            case 11:
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = d.f253311a;
                d.a(c.ERROR, "BackendScreenPresenter", "Unsupported RowDelegate ClickData parcel", null, h0Var3);
                return;
            default:
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList6 = d.f253311a;
                d.a(c.ERROR, "BackendScreenPresenter", "Model doesn't contain supported items", null, h0Var4);
                return;
        }
    }

    public /* synthetic */ a(g gVar) {
        this.f15674a = 0;
    }
}
