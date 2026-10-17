package vv8;

import android.app.Activity;
import android.graphics.Bitmap;
import cli.y;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineControllerContract$InputData;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends oki.h implements d {

    @NotNull
    public static final n Companion = new n();
    public final FourthlineControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t3i.m f292494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Activity f292495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mt8.d f292496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f292497s;

    public q(FourthlineControllerContract$InputData inputData, t3i.m fourthlineSdkProxy, Activity context, mt8.d kycInteractor, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(fourthlineSdkProxy, "fourthlineSdkProxy");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f292494p = fourthlineSdkProxy;
        this.f292495q = context;
        this.f292496r = kycInteractor;
        g gVar = g.f292480a;
        this.f292497s = mra.d.b(this, new b(false, gVar, gVar), stateMapper, null, false, 12);
    }

    public static final Object I2(q qVar, List list, URI uri2, av.a aVar, t3i.a aVar2, j21.c cVar, gim.i iVar) throws Throwable {
        av.a aVar3;
        my8.d dVar = uri2 != null ? new my8.d(new File(uri2), new my8.h(aVar, null, aVar2.f267785a, aVar2.f267786b, aVar2.f267787c, 6)) : null;
        List<t3i.d> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (t3i.d dVar2 : list2) {
            Bitmap bitmap = dVar2.f267788a;
            int i = o.f292490a[dVar2.f267789b.ordinal()];
            if (i == 1) {
                aVar3 = av.a.FRONT;
            } else if (i == 2) {
                aVar3 = av.a.BACK;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3 = av.a.SELFIE;
            }
            arrayList.add(new my8.c(bitmap, new my8.h(aVar3, dVar2.f267790c ? my8.g.TILTED : my8.g.NORMAL, aVar2.f267785a, aVar2.f267786b, aVar2.f267787c, 4)));
        }
        if (dVar != null) {
            arrayList = d0.F0(dVar, arrayList);
        }
        mt8.d dVar3 = qVar.f292496r;
        String str = qVar.o.f77765a;
        qt8.o oVar = ((qt8.d) dVar3).d;
        oVar.getClass();
        mp6.j jVar = new mp6.j(23, arrayList, oVar, str, cVar, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, jVar, iVar);
        fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar4) {
            objJ = Unit.f186387a;
        }
        if (objJ != aVar4) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar4 ? objJ : Unit.f186387a;
    }

    public final void J2() {
        FourthlineControllerContract$InputData fourthlineControllerContract$InputData = this.o;
        DocType documentType = fourthlineControllerContract$InputData.f77767c;
        String issuingCountry = fourthlineControllerContract$InputData.d;
        k onCompleted = new k(this, 1);
        t3i.m mVar = this.f292494p;
        mVar.getClass();
        Activity context = this.f292495q;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        try {
            mVar.a().launchDocuments(context, documentType, issuingCountry, onCompleted);
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            onCompleted.invoke(new t3i.g(th10));
        }
    }

    public final void K2() {
        k onCompleted = new k(this, 0);
        t3i.m mVar = this.f292494p;
        mVar.getClass();
        Activity context = this.f292495q;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        try {
            mVar.a().launchSelfie(context, onCompleted);
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            onCompleted.invoke(new t3i.g(th10));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f292497s;
    }
}
