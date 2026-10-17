package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details;

import aii.r;
import cli.y;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$DateOfBirthStatus;
import gim.i;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import li8.f;
import li8.g;
import li8.h;
import li8.m;
import md6.s;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ c A;
    public String u;
    public LocalDate v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f77058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f77059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public bj0.b f77060y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.A = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String string;
        String str;
        bj0.b bVar;
        LocalDate localDate;
        String str2;
        r gVar;
        c cVar = this.A;
        y yVar = cVar.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.z;
        if (i == 0) {
            o.b(obj2);
            string = d0.F0(((a) ((j2) yVar.f22677a).getValue()).f77053a).toString();
            JuniorPersonalDetailsScreenContract$DateOfBirthStatus juniorPersonalDetailsScreenContract$DateOfBirthStatus = ((a) ((j2) yVar.f22677a).getValue()).d;
            if ((juniorPersonalDetailsScreenContract$DateOfBirthStatus instanceof JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Invalid) || Intrinsics.f(juniorPersonalDetailsScreenContract$DateOfBirthStatus, JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Missing.f77045a)) {
                throw new IllegalStateException("Unexpected dobStatus: ".concat(juniorPersonalDetailsScreenContract$DateOfBirthStatus.getClass().getName()).toString());
            }
            if (juniorPersonalDetailsScreenContract$DateOfBirthStatus instanceof JuniorPersonalDetailsScreenContract$DateOfBirthStatus.OverRegistrationAge) {
                cVar.C2(new h(string));
                return Unit.f186387a;
            }
            if (!(juniorPersonalDetailsScreenContract$DateOfBirthStatus instanceof JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Valid)) {
                throw new NoWhenBranchMatchedException();
            }
            LocalDate localDate2 = ((JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Valid) juniorPersonalDetailsScreenContract$DateOfBirthStatus).f77048a;
            String string2 = d0.F0(((a) ((j2) yVar.f22677a).getValue()).f77054b).toString();
            String string3 = d0.F0(((a) ((j2) yVar.f22677a).getValue()).f77055c).toString();
            bj0.b bVar2 = ((a) ((j2) yVar.f22677a).getValue()).e;
            if (bVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            efm.d0 d0VarA = cVar.f77065t.a(string, s.d(string2, string3), jli.b.i(localDate2));
            this.u = string;
            this.v = localDate2;
            this.f77058w = string2;
            this.f77059x = string3;
            this.f77060y = bVar2;
            this.z = 1;
            Object objB = nim.a.b(d0VarA, this);
            if (objB == aVar) {
                return aVar;
            }
            str = string3;
            obj2 = objB;
            bVar = bVar2;
            localDate = localDate2;
            str2 = string2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bj0.b bVar3 = this.f77060y;
            String str3 = this.f77059x;
            String str4 = this.f77058w;
            LocalDate localDate3 = this.v;
            string = this.u;
            o.b(obj2);
            str = str3;
            bVar = bVar3;
            str2 = str4;
            localDate = localDate3;
        }
        mh8.a aVar2 = (mh8.a) obj2;
        ArrayList arrayList = aVar2.f205425b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof ConsentMechanics.OptOut) {
                arrayList2.add(obj3);
            }
        }
        PersonalDetailsForm personalDetailsForm = new PersonalDetailsForm(string, str2, str, localDate, bVar, arrayList2);
        int i2 = m.f195436a[aVar2.f205424a.ordinal()];
        if (i2 == 1) {
            gVar = new g(personalDetailsForm);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new f(personalDetailsForm);
        }
        cVar.C2(gVar);
        return Unit.f186387a;
    }
}
