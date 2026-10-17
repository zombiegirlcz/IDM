package gvc;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f147138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f147139c;

    public /* synthetic */ n(LinkedHashMap linkedHashMap, List list) {
        this.f147137a = 2;
        this.f147139c = linkedHashMap;
        this.f147138b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f147137a) {
            case 0:
                return g.a((g) obj2, this.f147138b, null, null, null, this.f147139c, null, null, null, false, 494);
            case 1:
                return g.a((g) obj2, null, this.f147138b, null, null, null, this.f147139c, null, null, false, 477);
            default:
                return loa.d.a((loa.d) obj2, this.f147139c, this.f147138b, 4);
        }
    }

    public /* synthetic */ n(List list, LinkedHashMap linkedHashMap, int i) {
        this.f147137a = i;
        this.f147138b = list;
        this.f147139c = linkedHashMap;
    }
}
