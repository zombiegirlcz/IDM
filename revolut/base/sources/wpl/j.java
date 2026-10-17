package wpl;

import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    @NotNull
    private static final i Companion = new i();

    public final vpl.b a() {
        return new vpl.b(b(), new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorGroupedBackground), null));
    }

    public final int b() {
        Integer numA = c90.a.a("#212121");
        if (numA != null) {
            return numA.intValue();
        }
        RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Couldn't parse #212121 color");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
        return 0;
    }
}
