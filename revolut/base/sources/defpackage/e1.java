package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.VideoCapture;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.AtmListScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.EmployerDetailsScreen;
import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.DeviceInfos;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;
import com.youTransactor.uCube.rpc.command.InstallForLoadKeyCommand;
import d80.g;
import efm.e0;
import efm.g0;
import efm.u;
import fa1.k;
import ihm.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import sa1.o;
import sa1.q;
import sa1.v;
import tfm.z0;
import uu9.h;
import xjl.i;
import xz0.c;
import xz0.j;
import yil.a;
import zg0.b;
import zh0.d;
import zh0.e;
import zp0.x;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class e1 implements ITaskMonitor, CallbackToFutureAdapter.Resolver, u, ITaskCancelListener, Config.OptionMatcher, OnApplyWindowInsetsListener, g0, x, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121756c;

    public /* synthetic */ e1(Object obj2, Object obj3, int i) {
        this.f121754a = i;
        this.f121755b = obj2;
        this.f121756c = obj3;
    }

    @Override // efm.u
    public void a(z0 emitter) {
        switch (this.f121754a) {
            case 2:
                q qVar = (q) this.f121755b;
                f fVar = (f) this.f121756c;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                qVar.b().connect(15000, 3, new o(emitter, fVar));
                break;
            default:
                e eVar = (e) this.f121755b;
                b bVar = (b) this.f121756c;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                try {
                    d dVar = new d(emitter);
                    emitter.d(new b80.a(eVar, dVar, 8));
                    Intrinsics.h(((FusedLocationProviderClient) eVar.f322209c.getValue()).requestLocationUpdates(zh0.a.a(bVar), dVar, ((HandlerThread) eVar.f322208b.getValue()).getLooper()));
                } catch (Exception e) {
                    emitter.b(e);
                }
                break;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((VideoCapture) this.f121755b).lambda$setupSurfaceUpdateNotifier$6((SessionConfig.Builder) this.f121756c, completer);
    }

    @Override // zp0.x
    public void e(String listId, String extractedValue, String formattedValue, boolean z) {
        int i = this.f121754a;
        Object obj2 = this.f121756c;
        Object obj3 = this.f121755b;
        switch (i) {
            case 9:
                KProperty[] kPropertyArr = EmployerDetailsScreen.Q;
                Intrinsics.checkNotNullParameter(listId, "<unused var>");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "<unused var>");
                ((com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.a) ((EmployerDetailsScreen) obj2).R2()).I2(new InputTextDelegate.TextData(((InputTextDelegate.Model) obj3).f52580a, extractedValue));
                break;
            case 10:
                KProperty[] kPropertyArr2 = FormScreen.V;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) ((FormScreen) obj3).d()).M2(((InputTextDelegate.Model) obj2).f52580a, extractedValue, formattedValue);
                break;
            default:
                KProperty[] kPropertyArr3 = SubformScreen.V;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) ((SubformScreen) obj3).d()).L2(((InputTextDelegate.Model) obj2).f52580a, extractedValue, formattedValue);
                break;
        }
    }

    @Override // yil.a
    public String generate() {
        switch (this.f121754a) {
            case 13:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f121755b;
                yol.b bVar = (yol.b) this.f121756c;
                String strB = bVar.f315701a.b();
                ref$ObjectRef.f186409a = strB;
                i iVar = bVar.f315701a;
                if (strB != null) {
                    return iVar.a(strB);
                }
                Intrinsics.r("codeVerifier");
                throw null;
            default:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f121755b;
                yol.d dVar = (yol.d) this.f121756c;
                String strB2 = dVar.f315704a.b();
                ref$ObjectRef2.f186409a = strB2;
                i iVar2 = dVar.f315704a;
                if (strB2 != null) {
                    return iVar2.a(strB2);
                }
                Intrinsics.r("codeVerifier");
                throw null;
        }
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f121754a) {
            case 0:
                f1 f1Var = (f1) this.f121755b;
                byte[] bArr = (byte[]) this.f121756c;
                f1Var.getClass();
                int i = y0.f310095a[taskEvent.ordinal()];
                if (i == 2) {
                    f1Var.H = new DeviceInfos(bArr);
                    v1.a("UCubeDevice Info retrieved : " + f1Var.H.getSerial() + " - " + f1Var.H.getPartNumber());
                    f1Var.notifyMonitor(TaskEvent.SUCCESS, f1Var.H);
                    break;
                } else if (i == 3) {
                    byte[] responseData = ((GetInfosCommand) objArr[0]).getResponseData();
                    if (responseData != null) {
                        byte[] bArr2 = new byte[bArr.length + responseData.length];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        System.arraycopy(responseData, 0, bArr2, bArr.length, responseData.length);
                        bArr = bArr2;
                    }
                    f1Var.H = new DeviceInfos(bArr);
                    v1.a("UCubeDevice Info retrieved : " + f1Var.H.getSerial() + " - " + f1Var.H.getPartNumber());
                    f1Var.notifyMonitor(TaskEvent.SUCCESS, f1Var.H);
                    break;
                }
                break;
            default:
                o1 o1Var = (o1) this.f121755b;
                InstallForLoadKeyCommand installForLoadKeyCommand = (InstallForLoadKeyCommand) this.f121756c;
                o1Var.getClass();
                int i2 = m1.f201171a[taskEvent.ordinal()];
                if (i2 == 1) {
                    o1Var.notifyMonitor(TaskEvent.FAILED, o1Var);
                    break;
                } else if (i2 == 2) {
                    byte[] fullData = installForLoadKeyCommand.getFullData();
                    v1.a("ca prod: " + Tools.bytesToHex(installForLoadKeyCommand.getCaProd()));
                    v1.a("kek : " + Tools.bytesToHex(installForLoadKeyCommand.getkKek()));
                    o1Var.notifyMonitor(TaskEvent.SUCCESS, fullData);
                    break;
                }
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        AtmListScreen atmListScreen = (AtmListScreen) this.f121755b;
        View view2 = (View) this.f121756c;
        KProperty[] kPropertyArr = AtmListScreen.W;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        atmListScreen.Q = tk2.q.a(view2);
        return insets;
    }

    @Override // com.youTransactor.uCube.ITaskCancelListener
    public void onCancelFinish(boolean z) {
        v vVar = (v) this.f121755b;
        z0 z0Var = (z0) this.f121756c;
        if (z) {
            ea1.b.a("Payment has been cancelled", k.INFO);
        } else {
            f fVar = vVar.f261259b;
            if (fVar != null) {
                fVar.onNext(Boolean.FALSE);
            }
            ea1.b.a("Payment cancellation has been rejected", k.ERROR);
        }
        z0Var.c(Boolean.valueOf(z));
        z0Var.a();
    }

    @Override // efm.g0
    public void subscribe(e0 emitter) {
        int i = this.f121754a;
        final int i2 = 1;
        Object obj2 = this.f121756c;
        Object obj3 = this.f121755b;
        switch (i) {
            case 6:
                uu9.f fVar = (uu9.f) obj3;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final int iK = kli.a.k(fVar.f283185b.f22265a, 40.0f);
                ContextThemeWrapper contextThemeWrapper = fVar.f283184a;
                yy0.f fVarQ = jh.d.f(contextThemeWrapper).Q();
                final ufm.a aVar = (ufm.a) emitter;
                final int i3 = 0;
                Function1 function1 = new Function1() { // from class: uu9.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i3) {
                            case 0:
                                Drawable drawable = (Drawable) obj4;
                                if (drawable != null) {
                                    int i5 = iK;
                                    aVar.b(DrawableKt.toBitmap$default(drawable, i5, i5, null, 4, null));
                                }
                                break;
                            default:
                                Drawable drawable2 = (Drawable) obj4;
                                if (drawable2 != null) {
                                    int i6 = iK;
                                    aVar.b(DrawableKt.toBitmap$default(drawable2, i6, i6, null, 4, null));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                yy0.e eVar = yy0.f.Companion;
                fVarQ.c((ContactImage) obj2, contextThemeWrapper, iK, iK, function1, null);
                break;
            case 7:
                h hVar = (h) obj3;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final int iK2 = kli.a.k(hVar.f283187b.f22265a, 40.0f);
                ContextThemeWrapper contextThemeWrapper2 = hVar.f283186a;
                yy0.f fVarQ2 = jh.d.f(contextThemeWrapper2).Q();
                final ufm.a aVar2 = (ufm.a) emitter;
                Function1 function12 = new Function1() { // from class: uu9.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i2) {
                            case 0:
                                Drawable drawable = (Drawable) obj4;
                                if (drawable != null) {
                                    int i5 = iK2;
                                    aVar2.b(DrawableKt.toBitmap$default(drawable, i5, i5, null, 4, null));
                                }
                                break;
                            default:
                                Drawable drawable2 = (Drawable) obj4;
                                if (drawable2 != null) {
                                    int i6 = iK2;
                                    aVar2.b(DrawableKt.toBitmap$default(drawable2, i6, i6, null, 4, null));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                yy0.e eVar2 = yy0.f.Companion;
                fVarQ2.c((Image) obj2, contextThemeWrapper2, iK2, iK2, function12, null);
                break;
            default:
                j jVar = (j) obj2;
                Intrinsics.checkNotNullParameter(emitter, "it");
                Context context = ((c) obj3).f309758a;
                ufm.a aVar3 = (ufm.a) emitter;
                u8.f fVarC0 = ((com.bumptech.glide.j) ((com.bumptech.glide.j) com.bumptech.glide.b.b(context).c(context).k().Z(jVar).q(true)).E(ue0.e.l(jVar, 7L, 0L))).N(new xz0.b(aVar3)).c0();
                Intrinsics.checkNotNullExpressionValue(fVarC0, "submit(...)");
                lfm.d.d(aVar3, new lfm.b(new g(fVarC0, 2)));
                break;
        }
    }
}
