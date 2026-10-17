package yh1;

import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetContract$InputData;
import java.util.Collections;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuggestionSheetContract$InputData f313724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f313725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f313726c;

    public j(e eVar, d dVar, SuggestionSheetContract$InputData suggestionSheetContract$InputData) {
        this.f313724a = suggestionSheetContract$InputData;
        int i = 27;
        this.f313725b = e4m.b.b(new q(eVar, this, 1, i));
        this.f313726c = e4m.b.b(new q(eVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
