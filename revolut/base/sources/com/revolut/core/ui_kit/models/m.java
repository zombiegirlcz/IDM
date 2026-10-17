package com.revolut.core.ui_kit.models;

import aw0.s8;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class m {
    public static final NavBarWithContainerBackground a(NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(navBarWithContainerBackground, "<this>");
        if (Intrinsics.f(navBarWithContainerBackground, NavBarWithContainerBackground.TransparentBackground.f57882a)) {
            return navBarWithContainerBackground;
        }
        if (!(navBarWithContainerBackground instanceof NavBarWithContainerBackground.ImageBackground)) {
            if (navBarWithContainerBackground instanceof NavBarWithContainerBackground.VideoBackground) {
                return c((NavBarWithContainerBackground.VideoBackground) navBarWithContainerBackground);
            }
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithContainerBackground.ImageBackground imageBackground = (NavBarWithContainerBackground.ImageBackground) navBarWithContainerBackground;
        Image image = imageBackground.f57881c;
        if (image == null) {
            return imageBackground;
        }
        s8 paletteType = imageBackground.f57880b;
        com.revolut.core.ui.models.Color color = imageBackground.d;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paletteType, "paletteType");
        return new NavBarWithContainerBackground.ImageBackground(image, paletteType, image, color);
    }

    public static final String b(String str) {
        return kotlin.text.a0.y(str, "@2x.png", false) ? a0.d.r(kotlin.text.d0.g0(str, "@2x.png"), "@3x.png") : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.core.ui_kit.models.NavBarWithContainerBackground.ImageBackground c(com.revolut.core.ui_kit.models.NavBarWithContainerBackground.VideoBackground r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground$ImageBackground r0 = new com.revolut.core.ui_kit.models.NavBarWithContainerBackground$ImageBackground
            com.revolut.core.ui_kit_core.displayers.image.Image r1 = r10.f57884b
            boolean r2 = r1 instanceof com.revolut.core.ui_kit_core.displayers.image.models.UrlImage
            if (r2 == 0) goto L33
            r3 = r1
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r3 = (com.revolut.core.ui_kit_core.displayers.image.models.UrlImage) r3
            java.lang.String r1 = r3.f60017a
            java.lang.String r2 = r3.f60018b
            java.lang.String r4 = b(r1)
            java.lang.String r5 = b(r2)
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L28
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L35
        L28:
            r8 = 0
            r9 = 524284(0x7fffc, float:7.34678E-40)
            r6 = 0
            r7 = 0
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r3 = com.revolut.core.ui_kit_core.displayers.image.models.UrlImage.a(r3, r4, r5, r6, r7, r8, r9)
            goto L35
        L33:
            com.revolut.core.ui_kit_core.displayers.image.Image r3 = r10.e
        L35:
            aw0.s8 r10 = r10.d
            r1 = 0
            r2 = 12
            r0.<init>(r3, r10, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.models.m.c(com.revolut.core.ui_kit.models.NavBarWithContainerBackground$VideoBackground):com.revolut.core.ui_kit.models.NavBarWithContainerBackground$ImageBackground");
    }
}
