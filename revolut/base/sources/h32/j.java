package h32;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nii.d f149012b;

    public /* synthetic */ j(nii.d dVar, int i) {
        this.f149011a = i;
        this.f149012b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f149011a) {
            case 0:
                Data data = zi0.c.P(this.f149012b.f216133a, false, null, 3);
                ((d) obj2).getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                break;
        }
        return ku1.h.a((ku1.h) obj2, null, null, null, null, null, (String) this.f149012b.f216133a, 31);
    }
}
