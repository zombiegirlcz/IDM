package com.revolut.feature.full_screen_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/full_screen_prompt/PromptMarketingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromptMarketingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PromptMarketingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingContentDelegate.Model f74501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f74502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74503c;
    public final boolean d;
    public final Boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PromptMarketingContentDelegate.Model model = (PromptMarketingContentDelegate.Model) parcel.readParcelable(PromptMarketingScreenContract$InputData.class.getClassLoader());
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(PromptMarketingScreenContract$InputData.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new PromptMarketingScreenContract$InputData(model, analyticsProduct, z4, z6, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromptMarketingScreenContract$InputData[i];
        }
    }

    public PromptMarketingScreenContract$InputData(PromptMarketingContentDelegate.Model promptModel, AnalyticsProduct analyticsProduct, boolean z, boolean z3, Boolean bool) {
        Intrinsics.checkNotNullParameter(promptModel, "promptModel");
        this.f74501a = promptModel;
        this.f74502b = analyticsProduct;
        this.f74503c = z;
        this.d = z3;
        this.e = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PromptMarketingScreenContract$InputData)) {
            return false;
        }
        PromptMarketingScreenContract$InputData promptMarketingScreenContract$InputData = (PromptMarketingScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74501a, promptMarketingScreenContract$InputData.f74501a) && Intrinsics.f(this.f74502b, promptMarketingScreenContract$InputData.f74502b) && this.f74503c == promptMarketingScreenContract$InputData.f74503c && this.d == promptMarketingScreenContract$InputData.d && Intrinsics.f(this.e, promptMarketingScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f74501a.hashCode() * 31;
        AnalyticsProduct analyticsProduct = this.f74502b;
        int iC = j6.a.c(j6.a.c((iHashCode + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31, 31, this.f74503c), 31, this.d);
        Boolean bool = this.e;
        return iC + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74501a, i);
        dest.writeParcelable(this.f74502b, i);
        dest.writeInt(this.f74503c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        Boolean bool = this.e;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    public /* synthetic */ PromptMarketingScreenContract$InputData(PromptMarketingContentDelegate.Model model, AnalyticsProduct analyticsProduct, boolean z, boolean z3, Boolean bool, int i) {
        this(model, (i & 2) != 0 ? null : analyticsProduct, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PromptMarketingScreenContract$InputData(Clause title, Clause description, Media image, PromptMarketingContentDelegate.Model.BackgroundType backgroundType, pd pdVar, ResourceImage resourceImage, ld ldVar, PromptMarketingContentDelegate.Model.Button button, PromptMarketingContentDelegate.Model.Button button2, id idVar, PromptMarketingContentDelegate.Model.Footer footer, Parcelable parcelable, AnalyticsProduct analyticsProduct, Clause clause, int i) {
        Boolean bool = Boolean.FALSE;
        PromptMarketingContentDelegate.Model.BackgroundType backgroundType2 = (i & 8) != 0 ? PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a : backgroundType;
        pd widgetTheme = (i & 16) != 0 ? pd.REGULAR : pdVar;
        ld descriptionStyle = (i & 64) != 0 ? ld.PRIMARY : ldVar;
        PromptMarketingContentDelegate.Model.Button button3 = (i & 128) != 0 ? null : button;
        PromptMarketingContentDelegate.Model.Button button4 = (i & 256) != 0 ? null : button2;
        id buttonStyle = (i & 512) != 0 ? id.VERTICAL : idVar;
        PromptMarketingContentDelegate.Model.Footer footer2 = (i & 1024) != 0 ? null : footer;
        Parcelable parcelable2 = (i & 2048) != 0 ? null : parcelable;
        AnalyticsProduct analyticsProduct2 = (i & 4096) != 0 ? null : analyticsProduct;
        Clause clause2 = (i & 8192) != 0 ? null : clause;
        boolean z = (i & 16384) == 0;
        bool = (i & 32768) != 0 ? null : bool;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(backgroundType2, "backgroundType");
        Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Boolean bool2 = bool;
        AnalyticsProduct analyticsProduct3 = analyticsProduct2;
        this(new PromptMarketingContentDelegate.Model("PromptId", title, description, new PromptMarketingContentDelegate.Model.Content.MediaContent(image, null), backgroundType2, widgetTheme, resourceImage, descriptionStyle, null, button3, button4, buttonStyle, footer2, null, parcelable2, null, null, clause2, null, null, null, 1941760), analyticsProduct3, false, z, bool2, 4);
    }
}
