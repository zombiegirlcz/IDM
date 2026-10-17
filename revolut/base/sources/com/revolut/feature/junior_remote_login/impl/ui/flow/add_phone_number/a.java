package com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.JuniorAddPhoneNumberFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import m84.e;
import ml8.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(JuniorAddPhoneNumberFlowContract$InputData inputData, pn3.a contactsPermissionsController) {
        FlowStep addPhoneNumber;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        if (((pn3.b) contactsPermissionsController).a()) {
            JuniorBankingProfile juniorBankingProfile = inputData.f77173a;
            addPhoneNumber = new JuniorAddPhoneNumberFlowContract$Step.ContactPicker(juniorBankingProfile.f77099b, juniorBankingProfile.f77100c);
        } else {
            JuniorBankingProfile juniorBankingProfile2 = inputData.f77173a;
            addPhoneNumber = new JuniorAddPhoneNumberFlowContract$Step.AddPhoneNumber(juniorBankingProfile2.f77099b, juniorBankingProfile2.k.getCountry());
        }
        this.o = d.a(this, addPhoneNumber, f0.f322471a, new e(this, 23));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
