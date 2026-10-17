package g14;

import g14.e;
import kotlin.jvm.internal.Intrinsics;
import uy3.i;

/* JADX INFO: loaded from: classes22.dex */
public final class f {
    public static i a(e dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String title = dto.getTitle();
        String description = dto.getDescription();
        e.a primaryButton = dto.getPrimaryButton();
        uy3.h hVar = new uy3.h(primaryButton.getText(), uy3.g.valueOf(primaryButton.getAction()));
        e.a secondaryButton = dto.getSecondaryButton();
        return new i(title, description, hVar, secondaryButton != null ? new uy3.h(secondaryButton.getText(), uy3.g.valueOf(secondaryButton.getAction())) : null);
    }
}
