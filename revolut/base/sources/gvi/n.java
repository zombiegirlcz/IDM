package gvi;

import com.google.protobuf.f3;
import eid.e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f147192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f147193c;

    public /* synthetic */ n(int i, String str, int i2) {
        this.f147191a = i2;
        this.f147192b = i;
        this.f147193c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f147191a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.I2(update, this.f147192b, new gqh.a(this.f147193c, 11));
            case 1:
                h update2 = (h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return r.I2(update2, this.f147192b, new gqh.a(this.f147193c, 12));
            case 2:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.v(buildStruct, "network_request_count", Integer.valueOf(this.f147192b));
                com.bumptech.glide.c.x(buildStruct, "non_idempotent_url", this.f147193c);
                return Unit.f186387a;
            default:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                int i = 0;
                for (Object obj3 : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList.add(lid.j.a((e0) obj3, this.f147192b + i + 1, this.f147193c));
                    i = i2;
                }
                return arrayList;
        }
    }

    public /* synthetic */ n(r rVar, int i, String str, int i2) {
        this.f147191a = i2;
        this.f147192b = i;
        this.f147193c = str;
    }
}
