package com.onfido.android.sdk.capture.internal.ui.countryselection;

import android.graphics.Typeface;
import androidx.core.graphics.TypefaceCompat;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.FontInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CountrySelectionAdapter$searchTermTypeface$2 extends u implements Function0<Typeface> {
    final /* synthetic */ CountrySelectionAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySelectionAdapter$searchTermTypeface$2(CountrySelectionAdapter countrySelectionAdapter) {
        super(0);
        this.this$0 = countrySelectionAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Typeface invoke() {
        FontInfo fontInfoResolveFontFromAttr = ContextUtilsKt.resolveFontFromAttr(this.this$0.context, R.attr.onfidoFontFamilyBody);
        if (fontInfoResolveFontFromAttr != null) {
            return TypefaceCompat.create(this.this$0.context, fontInfoResolveFontFromAttr.getTypeface(), 1);
        }
        return null;
    }
}
