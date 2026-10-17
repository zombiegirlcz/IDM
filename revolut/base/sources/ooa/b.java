package ooa;

import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.e;
import te0.j;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends iri.a implements a {
    public static final /* synthetic */ KProperty[] d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f227016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f227017c;

    static {
        h0 h0Var = new h0(b.class, "pdfPrinted", "getPdfPrinted()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        d = new KProperty[]{p0Var.j(h0Var), p.a.y(b.class, "payload", "getPayload()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public b() {
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f227016b = new j(bool);
        PdfNativeSaveContract$ProfileConfirmationPayload.Account account = new PdfNativeSaveContract$ProfileConfirmationPayload.Account(null, null);
        Intrinsics.checkNotNullParameter(account, "default");
        this.f227017c = new j(account);
    }

    @Override // iri.a
    public final Sequence v0() {
        KProperty[] kPropertyArr = d;
        e[] elements = {this.f227016b.getValue(this, kPropertyArr[0]), this.f227017c.getValue(this, kPropertyArr[1])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }
}
