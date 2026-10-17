package com.revolut.feature_retail_user_declarations.contact_selection;

import android.os.Parcelable;
import cn3.c;
import cn3.e;
import com.revolut.feature_retail_user_declarations.contact_selection.ContactSelectionWorkflowContract$Step;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import gim.i;
import jai.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.w;
import zm3.f;
import zm3.j;
import zm3.n;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ContactSelectionWorkflowContract$Step f97531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ cn3.b f97532x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContactSelectionWorkflowContract$Step contactSelectionWorkflowContract$Step, cn3.b bVar2, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f97531w = contactSelectionWorkflowContract$Step;
        this.f97532x = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f97531w, this.f97532x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Parcelable phone;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            String str = ((ContactSelectionWorkflowContract$Step.Chooser) this.f97531w).f97529a;
            c cVar = (c) this.f97532x;
            this.u = 1;
            List list = cVar.f25344a;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                zm3.a aVar2 = ((e) it8.next()).f25347a;
                if (aVar2 instanceof zm3.e) {
                    String email = ((zm3.e) aVar2).f323340a;
                    Intrinsics.checkNotNullParameter(email, "email");
                    phone = new MobileScreenParams.UserIdentifier.Email(email);
                } else if (aVar2 instanceof f) {
                    String phone2 = ((f) aVar2).f323345a;
                    Intrinsics.checkNotNullParameter(phone2, "phone");
                    phone = new MobileScreenParams.UserIdentifier.Phone(phone2);
                } else if (aVar2 instanceof zm3.i) {
                    String code = ((zm3.i) aVar2).f323353g;
                    Intrinsics.checkNotNullParameter(code, "code");
                    phone = new MobileScreenParams.UserIdentifier.Code(code);
                } else if (aVar2 instanceof j) {
                    String code2 = ((j) aVar2).f;
                    Intrinsics.checkNotNullParameter(code2, "code");
                    phone = new MobileScreenParams.UserIdentifier.Code(code2);
                } else if (aVar2 instanceof n) {
                    String email2 = ((n) aVar2).f323373a;
                    Intrinsics.checkNotNullParameter(email2, "email");
                    phone = new MobileScreenParams.UserIdentifier.Email(email2);
                } else {
                    if (!(aVar2 instanceof zm3.o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String phone3 = ((zm3.o) aVar2).f323376a;
                    Intrinsics.checkNotNullParameter(phone3, "phone");
                    phone = new MobileScreenParams.UserIdentifier.Phone(phone3);
                }
                arrayList.add(phone);
            }
            Object objJ = bVar.f97533p.j(str, new MobileScreenParams.ContactSelection(arrayList), this);
            if (objJ != fim.a.COROUTINE_SUSPENDED) {
                objJ = Unit.f186387a;
            }
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.C2(d.f172483a);
        return Unit.f186387a;
    }
}
