package rp0;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.dialogs.AlertDialogDisplayer$Button;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f256058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlertDialog f256059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f256060c;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f256058a = context;
        this.f256060c = v0.a.d("create(...)");
    }

    public final void a() {
        AlertDialog alertDialog = this.f256059b;
        if (alertDialog != null) {
            alertDialog.hide();
            jh.d.f(this.f256058a).n0().c(alertDialog);
        }
    }

    public final void b(final b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        a();
        int i = R$style.InternalAlertDialogTheme;
        Context context = this.f256058a;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, i);
        ty0.c cVarB0 = jh.d.f(context).b0();
        if (config.g() != null) {
            builder.setTitle(ty0.c.a(cVarB0, config.g(), this.f256058a, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        }
        builder.setMessage(ty0.c.a(cVarB0, config.c(), this.f256058a, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        final int i2 = 0;
        builder.setPositiveButton(ty0.c.a(cVarB0, config.f(), this.f256058a, null, null, null, null, Constants.TAG_FC_SPEED_MODE), new DialogInterface.OnClickListener(this) { // from class: rp0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f256038b;

            {
                this.f256038b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i5 = i2;
                b bVar = config;
                d dVar = this.f256038b;
                switch (i5) {
                    case 0:
                        py0.f fVarN0 = jh.d.f(dVar.f256058a).n0();
                        TrackableItem.Companion companion = TrackableItem.INSTANCE;
                        fVarN0.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.d), bVar.f256043b, "alert");
                        dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.POSITIVE));
                        break;
                    case 1:
                        py0.f fVarN02 = jh.d.f(dVar.f256058a).n0();
                        TrackableItem.Companion companion2 = TrackableItem.INSTANCE;
                        fVarN02.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.e), bVar.f256043b, "alert");
                        dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.NEUTRAL));
                        break;
                    default:
                        py0.f fVarN03 = jh.d.f(dVar.f256058a).n0();
                        TrackableItem.Companion companion3 = TrackableItem.INSTANCE;
                        fVarN03.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.f), bVar.f256043b, "alert");
                        dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.NEGATIVE));
                        break;
                }
            }
        });
        if (config.e() != null) {
            final int i3 = 1;
            builder.setNeutralButton(ty0.c.a(cVarB0, config.e(), this.f256058a, null, null, null, null, Constants.TAG_FC_SPEED_MODE), new DialogInterface.OnClickListener(this) { // from class: rp0.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f256038b;

                {
                    this.f256038b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i32) {
                    int i5 = i3;
                    b bVar = config;
                    d dVar = this.f256038b;
                    switch (i5) {
                        case 0:
                            py0.f fVarN0 = jh.d.f(dVar.f256058a).n0();
                            TrackableItem.Companion companion = TrackableItem.INSTANCE;
                            fVarN0.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.d), bVar.f256043b, "alert");
                            dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.POSITIVE));
                            break;
                        case 1:
                            py0.f fVarN02 = jh.d.f(dVar.f256058a).n0();
                            TrackableItem.Companion companion2 = TrackableItem.INSTANCE;
                            fVarN02.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.e), bVar.f256043b, "alert");
                            dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.NEUTRAL));
                            break;
                        default:
                            py0.f fVarN03 = jh.d.f(dVar.f256058a).n0();
                            TrackableItem.Companion companion3 = TrackableItem.INSTANCE;
                            fVarN03.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.f), bVar.f256043b, "alert");
                            dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.NEGATIVE));
                            break;
                    }
                }
            });
        }
        if (config.d() != null) {
            final int i5 = 2;
            builder.setNegativeButton(ty0.c.a(cVarB0, config.d(), this.f256058a, null, null, null, null, Constants.TAG_FC_SPEED_MODE), new DialogInterface.OnClickListener(this) { // from class: rp0.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f256038b;

                {
                    this.f256038b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i32) {
                    int i59 = i5;
                    b bVar = config;
                    d dVar = this.f256038b;
                    switch (i59) {
                        case 0:
                            py0.f fVarN0 = jh.d.f(dVar.f256058a).n0();
                            TrackableItem.Companion companion = TrackableItem.INSTANCE;
                            fVarN0.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.d), bVar.f256043b, "alert");
                            dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.POSITIVE));
                            break;
                        case 1:
                            py0.f fVarN02 = jh.d.f(dVar.f256058a).n0();
                            TrackableItem.Companion companion2 = TrackableItem.INSTANCE;
                            fVarN02.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.e), bVar.f256043b, "alert");
                            dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.NEUTRAL));
                            break;
                        default:
                            py0.f fVarN03 = jh.d.f(dVar.f256058a).n0();
                            TrackableItem.Companion companion3 = TrackableItem.INSTANCE;
                            fVarN03.f(new CustomTrackableComponent(bVar.f256047j, AlertDialogDisplayer$Button.class), new py0.c(bVar.f), bVar.f256043b, "alert");
                            dVar.f256060c.onNext(new c(bVar.f256042a, bVar.f256045g, AlertDialogDisplayer$Button.NEGATIVE));
                            break;
                    }
                }
            });
        }
        AlertDialog alertDialogShow = builder.setCancelable(config.h()).setOnDismissListener(new bqi.a(this, 1)).show();
        this.f256059b = alertDialogShow;
        py0.f fVarN0 = jh.d.f(context).n0();
        Intrinsics.h(alertDialogShow);
        fVarN0.g(alertDialogShow, config.g(), "alert", config.b(), config.a());
    }
}
