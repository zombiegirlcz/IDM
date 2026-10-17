package zz8;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;
import zx0.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzz8/d;", "Lzz8/c;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final class d extends c {

    @NotNull
    public static final d INSTANCE = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Object f326591b = j.c(k.PUBLICATION, new h(5));

    private d() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f326591b.getValue();
    }
}
