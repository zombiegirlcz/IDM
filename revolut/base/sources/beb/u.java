package beb;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f14755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xdb.y f14756c;

    public /* synthetic */ u(Data data, xdb.y yVar, int i) {
        this.f14754a = i;
        this.f14755b = data;
        this.f14756c = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14754a) {
        }
        return h.a((h) obj2, null, t1.d0(this.f14755b, this.f14756c), null, null, false, 29);
    }
}
