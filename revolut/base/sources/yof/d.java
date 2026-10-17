package yof;

import android.text.InputFilter;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public interface d {

    @NotNull
    public static final c Companion = c.f315674a;

    static InputTextDelegate.Model a(d dVar, String note, TextLocalisedClause label, Integer num, int i, boolean z, InputFilter.LengthFilter lengthFilter, ResourceImage resourceImage, ResourceImage resourceImage2, int i2) {
        List listC;
        Integer num2 = (i2 & 4) != 0 ? null : num;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        boolean z3 = (i2 & 16) != 0 ? true : z;
        Object dVar2 = (i2 & 32) != 0 ? new mp0.d(140) : lengthFilter;
        ResourceImage resourceImage3 = (i2 & 64) != 0 ? null : resourceImage;
        ResourceImage resourceImage4 = (i2 & 128) != 0 ? null : resourceImage2;
        ldd.b bVar = ((ppf.c) dVar).f238599a;
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(label, "label");
        TextClause textClause = new TextClause(note, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (dVar2 == null || (listC = u.c(dVar2)) == null) {
            listC = f0.f322471a;
        }
        return new InputTextDelegate.Model("ITEM_NOTE_INPUT_ID", textClause, label, null, null, resourceImage3, resourceImage4, num2 != null, Integer.valueOf(num2 != null ? num2.intValue() : 140), false, false, 0, true, 0, z3, bVar.a("ITEM_NOTE_INPUT_ID"), !d0.W(note), listC, false, false, 0, bVar.c(i3, "ITEM_NOTE_INPUT_ID"), false, null, 855576568, 131007);
    }
}
