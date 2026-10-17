package vq9;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f291361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f291362c;

    public i(String str, int i, UrlImage urlImage) {
        this.f291360a = str;
        this.f291361b = i;
        this.f291362c = urlImage;
    }
}
