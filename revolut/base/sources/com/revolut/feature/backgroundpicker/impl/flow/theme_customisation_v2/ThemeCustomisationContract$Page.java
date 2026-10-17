package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backgroundpicker.impl.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$Page", "Landroid/os/Parcelable;", "", "Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationContract$Page;", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "Lcom/revolut/core/ui_kit/models/Clause;", "getTitle", "()Lcom/revolut/core/ui_kit/models/Clause;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icon", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "getIcon", "()Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "buttonStyle", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "a", "()Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "MODE", "THEME", "ACCENT", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemeCustomisationContract$Page implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ThemeCustomisationContract$Page[] $VALUES;
    public static final ThemeCustomisationContract$Page ACCENT;

    @NotNull
    public static final Parcelable.Creator<ThemeCustomisationContract$Page> CREATOR;
    public static final ThemeCustomisationContract$Page MODE;
    public static final ThemeCustomisationContract$Page THEME;

    @NotNull
    private final CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle buttonStyle;
    private final Image icon;

    @NotNull
    private final Clause title;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ThemeCustomisationContract$Page.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemeCustomisationContract$Page[i];
        }
    }

    static {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.background_picker_tab_theme, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_contrast, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.PrimaryNeutral primaryNeutral = CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.PrimaryNeutral.f52095a;
        ThemeCustomisationContract$Page themeCustomisationContract$Page = new ThemeCustomisationContract$Page("MODE", 0, textLocalisedClause, resourceImage, primaryNeutral);
        MODE = themeCustomisationContract$Page;
        ThemeCustomisationContract$Page themeCustomisationContract$Page2 = new ThemeCustomisationContract$Page("THEME", 1, new TextLocalisedClause(R$string.background_picker_tab_color, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_palette, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), primaryNeutral);
        THEME = themeCustomisationContract$Page2;
        ThemeCustomisationContract$Page themeCustomisationContract$Page3 = new ThemeCustomisationContract$Page("ACCENT", 2, new TextLocalisedClause(R$string.theme_customisation_selector_accent_title, null, null, 14), null, CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.SolidAccentButton.f52097a);
        ACCENT = themeCustomisationContract$Page3;
        ThemeCustomisationContract$Page[] themeCustomisationContract$PageArr = {themeCustomisationContract$Page, themeCustomisationContract$Page2, themeCustomisationContract$Page3};
        $VALUES = themeCustomisationContract$PageArr;
        $ENTRIES = s.n(themeCustomisationContract$PageArr);
        CREATOR = new a();
    }

    public ThemeCustomisationContract$Page(String str, int i, TextLocalisedClause textLocalisedClause, ResourceImage resourceImage, CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle buttonStyle) {
        this.title = textLocalisedClause;
        this.icon = resourceImage;
        this.buttonStyle = buttonStyle;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static ThemeCustomisationContract$Page valueOf(String str) {
        return (ThemeCustomisationContract$Page) Enum.valueOf(ThemeCustomisationContract$Page.class, str);
    }

    public static ThemeCustomisationContract$Page[] values() {
        return (ThemeCustomisationContract$Page[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final Clause getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
