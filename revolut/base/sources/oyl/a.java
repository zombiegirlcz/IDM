package oyl;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import jyl.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends RecyclerView.ViewHolder {
    public final ImageView e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f231053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a2 f231054h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ImageView imageView, g renderer, CoroutineScope scope) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.e = imageView;
        this.f = renderer;
        this.f231053g = scope;
    }
}
