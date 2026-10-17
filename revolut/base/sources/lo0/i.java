package lo0;

import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsMetadata;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.tracking.v3.UiInteraction;
import com.revolut.tracking.v3.UiInteractionDevice;
import com.revolut.tracking.v3.WidgetDescription;
import grl.vd;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import uo.o0;
import uo.p;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ View A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ AnalyticsProduct D;
    public final /* synthetic */ WidgetDescription E;
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f197338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o0 f197339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f197340y;
    public final /* synthetic */ TrackableItem z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Ref$ObjectRef ref$ObjectRef, o0 o0Var, p pVar, TrackableItem trackableItem, View view, String str, String str2, AnalyticsProduct analyticsProduct, WidgetDescription widgetDescription, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f197338w = ref$ObjectRef;
        this.f197339x = o0Var;
        this.f197340y = pVar;
        this.z = trackableItem;
        this.A = view;
        this.B = str;
        this.C = str2;
        this.D = analyticsProduct;
        this.E = widgetDescription;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f197338w, this.f197339x, this.f197340y, this.z, this.A, this.B, this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        vd vdVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o0 o0Var = this.f197339x;
        k kVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            mo.c cVar = kVar.d;
            Class<?> cls = this.f197338w.f186409a.getClass();
            String str = o0Var.f281497b;
            this.u = 1;
            objA = cVar.a(cls, str, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objA = obj2;
        }
        mo.e eVar = (mo.e) objA;
        String str2 = o0Var.f281496a;
        p pVar = this.f197340y;
        Integer num = pVar != null ? new Integer(pVar.f281499b) : null;
        Integer num2 = pVar != null ? new Integer(pVar.f281500c) : null;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        Parcelable k = this.z.getE();
        companion.getClass();
        w0 w0VarA = AnalyticsContext.Companion.a(k);
        KeyEvent.Callback callback = this.A;
        AnalyticsMetadata analyticsMetadata = null;
        if (callback instanceof zz0.d) {
            zz0.h interactionTracker = ((zz0.d) callback).getInteractionTracker();
            zz0.c cVar2 = interactionTracker.e;
            interactionTracker.e = null;
            if (cVar2 != null) {
                UiInteraction.a aVarNewBuilder = UiInteraction.newBuilder();
                switch (uo.i.f281484a[cVar2.f326474a.ordinal()]) {
                    case 1:
                        vdVar = vd.Dpad;
                        break;
                    case 2:
                        vdVar = vd.Gamepad;
                        break;
                    case 3:
                        vdVar = vd.Joystick;
                        break;
                    case 4:
                        vdVar = vd.Keyboard;
                        break;
                    case 5:
                        vdVar = vd.Mouse;
                        break;
                    case 6:
                        vdVar = vd.MouseRelative;
                        break;
                    case 7:
                        vdVar = vd.Stylus;
                        break;
                    case 8:
                        vdVar = vd.Touchpad;
                        break;
                    case 9:
                        vdVar = vd.Touchscreen;
                        break;
                    case 10:
                        vdVar = vd.Trackball;
                        break;
                    case 11:
                        vdVar = vd.Unknown;
                        break;
                    case 12:
                        vdVar = vd.AccessibilityNode;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                aVarNewBuilder.c();
                ((UiInteraction) aVarNewBuilder.f49761b).setSource(vdVar);
                zz0.a aVar2 = cVar2.f326475b;
                if (aVar2 != null) {
                    UiInteractionDevice.a aVarNewBuilder2 = UiInteractionDevice.newBuilder();
                    String str3 = aVar2.f326471a;
                    aVarNewBuilder2.c();
                    ((UiInteractionDevice) aVarNewBuilder2.f49761b).setName(str3);
                    boolean z = aVar2.f326472b;
                    aVarNewBuilder2.c();
                    ((UiInteractionDevice) aVarNewBuilder2.f49761b).setVirtual(z);
                    boolean z3 = aVar2.f326473c;
                    aVarNewBuilder2.c();
                    ((UiInteractionDevice) aVarNewBuilder2.f49761b).setExternal(z3);
                    aVarNewBuilder.c();
                    ((UiInteraction) aVarNewBuilder.f49761b).setDevice((UiInteractionDevice) aVarNewBuilder2.a());
                }
                int i2 = cVar2.f326476c;
                aVarNewBuilder.c();
                ((UiInteraction) aVarNewBuilder.f49761b).setErasers(i2);
                int i3 = cVar2.d;
                aVarNewBuilder.c();
                ((UiInteraction) aVarNewBuilder.f49761b).setFingers(i3);
                int i5 = cVar2.e;
                aVarNewBuilder.c();
                ((UiInteraction) aVarNewBuilder.f49761b).setMouses(i5);
                int i6 = cVar2.f;
                aVarNewBuilder.c();
                ((UiInteraction) aVarNewBuilder.f49761b).setStyluses(i6);
                int i21 = cVar2.f326477g;
                aVarNewBuilder.c();
                ((UiInteraction) aVarNewBuilder.f49761b).setUnknownTools(i21);
                AnalyticsMetadata.Companion companion2 = AnalyticsMetadata.INSTANCE;
                w0 w0VarA2 = aVarNewBuilder.a();
                companion2.getClass();
                analyticsMetadata = new AnalyticsMetadata(AnalyticsMetadata.Companion.a(w0VarA2));
            }
        }
        kVar.f197349j.e2(new ho.a(this.B, str2, this.C, num, num2, this.D, new AnalyticsContext(w0VarA), this.E, analyticsMetadata, eVar));
        return Unit.f186387a;
    }
}
