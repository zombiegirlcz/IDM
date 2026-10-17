package com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow;

import a26.q;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$Step;
import e60.j;
import e60.k;
import e60.l;
import e60.m;
import elm.f;
import gim.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jli.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rd0.d;
import skm.e0;
import skm.p0;
import yhm.o;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f68196w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f68196w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f68196w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        l lVar = (l) this.v;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.f68196w;
        if (i == 0) {
            o.b(obj2);
            if (lVar instanceof j) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, "PhotosUploadController", "File selection failed: " + ((j) lVar).f122857a, null, h0Var);
            } else if ((lVar instanceof k) || (lVar instanceof l.a)) {
                int i2 = h.f175850a;
            } else {
                if (!(lVar instanceof m)) {
                    throw new NoWhenBranchMatchedException();
                }
                wx3.c cVar2 = cVar.f68200r;
                String str = cVar.f68198p.f68189a.f66892b;
                List list = ((m) lVar).f122862a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new ry3.a((File) it8.next()));
                }
                this.v = null;
                this.u = 1;
                a44.d dVar = cVar2.f300751a;
                dVar.getClass();
                q qVar = new q(dVar, str, arrayList, null, 2);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(f.f127540b, qVar, this);
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                if (objJ != obj4) {
                    objJ = Unit.f186387a;
                }
                if (objJ != obj4) {
                    objJ = Unit.f186387a;
                }
                if (objJ == obj3) {
                    return obj3;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        PhotosUploadFlowContract$Step photosUploadFlowContract$Step = (PhotosUploadFlowContract$Step) cVar.f68202t.d();
        if (photosUploadFlowContract$Step instanceof PhotosUploadFlowContract$Step.Intro) {
            oki.h.t2(cVar, cVar.f68202t, new PhotosUploadFlowContract$Step.Summary(((PhotosUploadFlowContract$Step.Intro) photosUploadFlowContract$Step).f68192a.f19923b), false, null, false, 12);
        }
        return Unit.f186387a;
    }
}
