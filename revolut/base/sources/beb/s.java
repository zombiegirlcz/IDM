package beb;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xdb.y f14751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f14752c;

    public /* synthetic */ s(xdb.y yVar, Throwable th10, int i) {
        this.f14750a = i;
        this.f14751b = yVar;
        this.f14752c = th10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14750a) {
        }
        return h.a((h) obj2, null, new Data(this.f14751b, this.f14752c, false, 4, null), null, null, false, 29);
    }
}
