package gag;

import androidx.collection.LruCache;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestsReviews;
import kotlin.jvm.internal.Intrinsics;
import lk0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f142172a = new LruCache(20);

    @Override // gag.d
    public final Object a(f fVar, Object obj2) {
        bgi.a key = (bgi.a) fVar;
        HotelsPropertyGuestsReviews value = (HotelsPropertyGuestsReviews) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        HotelsPropertyGuestsReviews hotelsPropertyGuestsReviews = (HotelsPropertyGuestsReviews) this.f142172a.put(key, value);
        if (hotelsPropertyGuestsReviews != null) {
            return hotelsPropertyGuestsReviews;
        }
        f0 f0Var = f0.f322471a;
        return new HotelsPropertyGuestsReviews(f0Var, 0, f0Var);
    }

    @Override // gag.d
    public final Object b(f fVar) {
        bgi.a key = (bgi.a) fVar;
        Intrinsics.checkNotNullParameter(key, "key");
        return (HotelsPropertyGuestsReviews) this.f142172a.get(key);
    }
}
