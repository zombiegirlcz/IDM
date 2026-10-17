package js4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f178124a;

    public e(Data model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f178124a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f178124a, ((e) obj2).f178124a);
    }

    public final int hashCode() {
        return this.f178124a.hashCode();
    }
}
