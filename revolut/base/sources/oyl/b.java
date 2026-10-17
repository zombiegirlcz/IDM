package oyl;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cam.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import jyl.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oxd.m;
import skm.a2;
import skm.e0;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends RecyclerView.Adapter {
    public final CoroutineScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f231055g;

    public b(File file, fl1.c bitmapCacheManager, m onError) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(bitmapCacheManager, "bitmapCacheManager");
        Intrinsics.checkNotNullParameter(onError, "onError");
        p0 p0Var = p0.f264001a;
        this.f = rd0.e.a(o.f323119a.plus(e0.e()));
        this.f231055g = new g(file, bitmapCacheManager, onError);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((Number) this.f231055g.f.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a holder = (a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        a2 a2Var = holder.f231054h;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        holder.f231054h = null;
        ImageView imageView = holder.e;
        imageView.animate().cancel();
        imageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        imageView.setImageBitmap(null);
        holder.f231054h = e0.C(holder.f231053g, null, null, new q(i, 10, holder, continuation), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ImageView imageView = new ImageView(parent.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        imageView.setAdjustViewBounds(true);
        return new a(imageView, this.f231055g, this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        osk.m mVar = new osk.m(this, null, 13);
        CoroutineScope coroutineScope = this.f;
        e0.C(coroutineScope, null, null, mVar, 3);
        e0.k(coroutineScope, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        a holder = (a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        a2 a2Var = holder.f231054h;
        if (a2Var != null) {
            a2Var.f(null);
        }
        holder.f231054h = null;
        ImageView imageView = holder.e;
        imageView.animate().cancel();
        imageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        imageView.setImageBitmap(null);
    }
}
