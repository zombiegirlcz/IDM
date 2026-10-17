package w9m;

import androidx.compose.foundation.gestures.ScrollScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes23.dex */
public final class f extends gim.c {
    public int A;
    public Object u;
    public ScrollScope v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f295770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f295771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f295772y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Continuation continuation) {
        super(continuation);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f295772y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, 0, BitmapDescriptorFactory.HUE_RED, this);
    }
}
