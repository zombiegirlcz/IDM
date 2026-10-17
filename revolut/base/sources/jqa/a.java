package jqa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreenContract$InputData;
import java.util.Set;
import jm4.o3;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalFieldsScreenContract$InputData f177528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f177529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f177530c;
    public final e4m.e d;

    public a(e eVar, AdditionalFieldsScreenContract$InputData additionalFieldsScreenContract$InputData) {
        this.f177528a = additionalFieldsScreenContract$InputData;
        this.f177529b = e4m.b.b(new o3(eVar, this, 1));
        this.f177530c = e4m.b.b(new o3(eVar, this, 0));
        this.d = e4m.b.b(new o3(eVar, this, 2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
