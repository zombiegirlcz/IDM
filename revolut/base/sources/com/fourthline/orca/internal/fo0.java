package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import com.fourthline.orca.internal.bo0;
import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fo0 implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f28584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p70 f28585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f28586c;

    public fo0(Function0 imageProvider, p70 poaDocumentPlaceholderLottieSource, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(poaDocumentPlaceholderLottieSource, "poaDocumentPlaceholderLottieSource");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f28584a = imageProvider;
        this.f28585b = poaDocumentPlaceholderLottieSource;
        this.f28586c = imageServiceLocator;
    }

    public final Function1 a(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new yl1(image, 0);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public bo0 getInitialState() {
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_document_capture_header_confirm, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.step_document_capture_title_capture_ok, 0, 2, null);
        Bitmap bitmap = (Bitmap) this.f28584a.invoke();
        return new bo0(dVarA, dVarA2, bitmap != null ? new bo0.a.b(bitmap) : new bo0.a.C0172a(this.f28585b), c81.a.a(aVar, R.string.step_poa_capture_message_confirm_first, 0, 2, null), c81.a.a(aVar, R.string.step_poa_capture_message_confirm_second, 0, 2, null), c81.a.a(aVar, R.string.step_poa_capture_message_confirm_third, 0, 2, null), c81.a.a(aVar, R.string.shared_button_change_document, 0, 2, null), c81.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), this.f28586c.a(r10.P0), null, 512, null);
    }

    public final Function1 p() {
        return new bi1(26);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bo0 a(Bitmap bitmap, bo0 bo0Var) {
        Intrinsics.checkNotNullParameter(bo0Var, "<this>");
        return bo0.a(bo0Var, null, null, null, null, null, null, null, null, null, new hw(AndroidImageBitmap_androidKt.asImageBitmap(bitmap)), 511, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bo0 a(bo0 bo0Var) {
        Intrinsics.checkNotNullParameter(bo0Var, "<this>");
        return bo0.a(bo0Var, null, null, null, null, null, null, null, null, null, null, 511, null);
    }
}
