package kv5;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static SplitAccountsItemGroup.RowItem a(String id10, TextLocalisedClause title, CompositeClause compositeClause, LayeredImage image, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        return new SplitAccountsItemGroup.RowItem(id10, new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 60), (Clause) title, (ResourceImage) null, (Clause) compositeClause, (SplitAccountsItemGroup.RowItem.Value) null, false, false, parcelable, 456);
    }
}
