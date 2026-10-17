package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields;

import cli.y;
import com.revolut.feature.push_to_card.api.model.AdditionalField;
import com.revolut.feature.push_to_card.api.model.TextFieldContent;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput;
import era.i;
import hx7.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ldd.b;
import mra.d;
import oki.h;
import plb.g;
import pqa.k;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements k {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f81555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qqa.a f81556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f81557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f81558s;

    public a(i modalScreensDataProvider, b focusRequesterDelegate, qqa.a changeDelegate, sqa.b fieldInputMapper, AdditionalFieldsScreenContract$InputData inputData, i3g.k stateMapper) {
        AdditionalFieldInput dropdownInput;
        Intrinsics.checkNotNullParameter(modalScreensDataProvider, "modalScreensDataProvider");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(changeDelegate, "changeDelegate");
        Intrinsics.checkNotNullParameter(fieldInputMapper, "fieldInputMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = modalScreensDataProvider;
        this.f81555p = focusRequesterDelegate;
        this.f81556q = changeDelegate;
        List additionalFields = inputData.f81552a;
        Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
        List<AdditionalField> list = additionalFields;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (AdditionalField additionalField : list) {
            if (additionalField instanceof AdditionalField.TextField) {
                AdditionalField.TextField textField = (AdditionalField.TextField) additionalField;
                String str = textField.f81505a;
                TextFieldContent textFieldContent = textField.f81506b;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                dropdownInput = new AdditionalFieldInput.TextInput(str, textFieldContent, "", "", textField.f81506b.f81519a ? uqa.b.Empty : uqa.b.Valid);
            } else {
                if (!(additionalField instanceof AdditionalField.DropdownField)) {
                    throw new NoWhenBranchMatchedException();
                }
                AdditionalField.DropdownField dropdownField = (AdditionalField.DropdownField) additionalField;
                dropdownInput = new AdditionalFieldInput.DropdownInput(dropdownField.f81503a, dropdownField.f81504b, null);
            }
            arrayList.add(dropdownInput);
        }
        this.f81557r = d.b(this, new pqa.i(arrayList, 0), stateMapper, null, false, 12);
        this.f81558s = e.a(this, new g(this, 16));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f81558s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f81557r;
    }
}
