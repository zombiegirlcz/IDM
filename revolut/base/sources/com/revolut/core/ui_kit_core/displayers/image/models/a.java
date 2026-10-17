package com.revolut.core.ui_kit_core.displayers.image.models;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final BulletImage a(int i, Integer num, Integer num2, Integer num3, float f) {
        return new BulletImage(new BulletImage.Content.Number(i), num, num2, num3, f, 32);
    }

    public static /* synthetic */ BulletImage b(int i, Integer num, Integer num2, Integer num3, int i2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        if ((i2 & 8) != 0) {
            num3 = null;
        }
        return a(i, num, num2, num3, (i2 & 16) != 0 ? 2.0f : BitmapDescriptorFactory.HUE_RED);
    }
}
