package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bi implements x2, j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f27133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f27134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s2 f27135c;

    public bi(y2 delegate, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f27133a = delegate;
        this.f27134b = imageServiceLocator;
        c81.a aVar = c81.f27404a;
        this.f27135c = new s2("document_country", new m80.b(false), new m80.a.C0250a(null, 1, null), c81.a.a(aVar, R.string.step_document_country_header, 0, 2, null), new r2(null, "document_country", false, c81.a.a(aVar, R.string.step_document_country_label_country, 0, 2, null), c81.a.a(aVar, R.string.shared_placeholder_search, 0, 2, null), null, l20.f30507a, null, null, null, null, imageServiceLocator.a(r10.O0), 1957, null));
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f27133a.a(input);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 b(a01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f27133a.b(item);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 d(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f27133a.d(input);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s2 getInitialState() {
        return this.f27135c;
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return this.f27133a.a(suggestions);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(k20 k20Var) {
        return this.f27133a.a(k20Var);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(a01 a01Var, boolean z) {
        return this.f27133a.a(a01Var, z);
    }

    @Override // com.fourthline.orca.internal.x2
    public Function1 a(a01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f27133a.a(item);
    }
}
