package e60;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import androidx.appcompat.app.AppCompatActivity;
import com.revolut.controller_extension_media_picker.R$string;
import com.revolut.core.ui_kit.delegates.PhotoDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.na;
import com.revolut.core.ui_kit.delegates.oa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.u00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f122866w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122866w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f122866w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f122866w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        oli.m mVar;
        int i = this.u;
        s sVar = this.f122866w;
        switch (i) {
            case 0:
                t80.v vVar = sVar.d;
                rp0.m mVar2 = sVar.e;
                h hVar = (h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!(hVar instanceof f)) {
                    if (hVar instanceof d) {
                        mVar2.b(true);
                        i iVar = ((d) hVar).f122841a;
                        if (iVar == null || (mVar = iVar.f122856n) == null) {
                            mVar = oli.m.DEFAULT;
                        }
                        t80.v.d(vVar, null, mVar, 1);
                    } else if (hVar instanceof e) {
                        mVar2.b(true);
                        e eVar = (e) hVar;
                        vVar.e(null, eVar.f122843b, eVar.f122844c);
                    } else if (hVar instanceof g) {
                        try {
                            uh0.b bVar = ((g) hVar).f122847b;
                            Activity activityM2 = sVar.f122867c.m2();
                            Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                            bVar.a((AppCompatActivity) activityM2, 8765);
                        } catch (IntentSender.SendIntentException e) {
                            sVar.f.c3(e);
                        }
                    } else {
                        if (!(hVar instanceof c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sVar.R(((c) hVar).f122840b);
                    }
                    break;
                } else {
                    i inputData = ((f) hVar).f122845a;
                    boolean zF = xam.a.f(vVar.f268782b, new Intent("android.media.action.IMAGE_CAPTURE"));
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    ArrayList arrayList = new ArrayList();
                    u00 u00Var = inputData.f122853j;
                    if (zF && u00Var != null) {
                        na naVar = new na("id_camera", new PhotoDelegate.a.C0417a(u00Var));
                        yp0.b.l(naVar, 0, 0, 0, 0, null, false, 63);
                        arrayList.add(naVar);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    boolean z = false;
                    int i2 = 6;
                    arrayList2.add(new RowDelegate.Model("id_from_gallery", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i2), new TextLocalisedClause(R$string.media_picker_dialog_action_choose_from_gallery, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                    if (inputData.d) {
                        arrayList2.add(new RowDelegate.Model("id_upload_document", new RowDelegate.Model.MainImage.Image24(new ResourceImage(inputData.f, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i2), new TextLocalisedClause(inputData.e, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                    }
                    List list = inputData.k;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    if (it8.hasNext()) {
                        throw v0.a.e(it8);
                    }
                    zhm.a0.x(arrayList3, arrayList2);
                    if (inputData.i) {
                        arrayList2.add(new RowDelegate.Model("id_remove", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i2), new TextLocalisedClause(R$string.media_picker_dialog_action_remove, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                    }
                    yp0.b.k(arrayList2, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 28);
                    zhm.a0.x(arrayList2, arrayList);
                    Clause clause = inputData.f122849b;
                    rp0.y yVar = new rp0.y(arrayList, clause == null ? null : new rp0.t(clause, inputData.f122850c, null, 28), rp0.l.WINDOW, null, null, null, 952);
                    if (mVar2.a()) {
                        mVar2.m(yVar);
                    } else {
                        mVar2.k(yVar);
                    }
                }
                return Unit.f186387a;
            default:
                a0 a0Var = (a0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (a0Var.f256040a) {
                    for (oa oaVar : sVar.i.d) {
                        if (oaVar.f54540l != null && oaVar.f54541m != null) {
                            oaVar.I();
                            oaVar.H();
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
