package gyi;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f147897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f147898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final egk.e f147899c;
    public final LayeredImage d;

    public n(fkg.a qrCodeGenerator, c90.c uiResources, egk.e pricingPlansUiInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f147897a = qrCodeGenerator;
        this.f147898b = uiResources;
        this.f147899c = pricingPlansUiInteractor;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_lounges;
        int i2 = R$attr.uikit_colorBlack;
        this.d = LayeredImage.Companion.p(companion, i, Integer.valueOf(i2), R$attr.uikit_colorTransparent, 4.0f, 24.0f);
    }

    public static boolean a(svi.r rVar) {
        String[] elements = {rVar.f265977n, rVar.o};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            return false;
        }
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            if (!kotlin.text.d0.W((String) it8.next())) {
                return true;
            }
        }
        return false;
    }
}
