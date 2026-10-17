package pgm;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a extends Flowable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Flowable f236000b;

    public a(Flowable flowable) {
        Objects.requireNonNull(flowable, "source is null");
        this.f236000b = flowable;
    }
}
