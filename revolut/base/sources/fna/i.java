package fna;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ResourceImage f136586c = new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model.MainImage.Image24 f136587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tf f136588b = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);

    public static final class a {
        private a() {
        }
    }

    public i() {
        boolean z = false;
        this.f136587a = new RowDelegate.Model.MainImage.Image24(f136586c, z, z, 6);
    }

    public static ListSubheaderDelegate.Model a(int i, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new ListSubheaderDelegate.Model(listId, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static RowDelegate.Model c(i iVar, String listId, int i, Integer num, Object obj2, RowDelegate.Model.MainImage.Image24 image24, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        Object obj3 = (i2 & 8) != 0 ? null : obj2;
        boolean z = (i2 & 16) == 0;
        if ((i2 & 32) != 0) {
            image24 = iVar.f136587a;
        }
        RowDelegate.Model.MainImage.Image24 mainImage = image24;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(mainImage, "mainImage");
        return iVar.b(listId, new TextLocalisedClause(i, null, null, 14), num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, obj3, z, mainImage);
    }

    public static /* synthetic */ RowDelegate.Model d(i iVar, String str, Clause clause, Parcelable parcelable, RowDelegate.Model.MainImage mainImage, int i) {
        if ((i & 8) != 0) {
            parcelable = null;
        }
        Parcelable parcelable2 = parcelable;
        boolean z = (i & 16) == 0;
        if ((i & 32) != 0) {
            mainImage = iVar.f136587a;
        }
        return iVar.b(str, clause, null, parcelable2, z, mainImage);
    }

    public static List e(List list, ListSubheaderDelegate.Model header) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        return list.isEmpty() ? list : yp0.b.g(list, header, null, 0, 0, 126);
    }

    public final RowDelegate.Model b(String listId, Clause title, Clause clause, Object obj2, boolean z, RowDelegate.Model.MainImage mainImage) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mainImage, "mainImage");
        return new RowDelegate.Model(listId, mainImage, title, null, 0, clause, null, null, 0, z ? this.f136588b : null, false, null, false, null, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 532675544);
    }
}
