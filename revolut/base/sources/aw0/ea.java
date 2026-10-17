package aw0;

import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class ea {

    @NotNull
    private static final z9 Companion = new z9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f10301c;
    public final float d;
    public final int e;
    public final int f;

    public ea(int i, int i2, Integer num, float f, int i3, int i5) {
        this.f10299a = i;
        this.f10300b = i2;
        this.f10301c = num;
        this.d = f;
        this.e = i3;
        this.f = i5;
    }

    public abstract GlyphImage a();
}
