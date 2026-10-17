package gv8;

import com.revolut.shared.feature.workflow.engine.api.models.workflow.Redirect;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Redirect f147074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f147076c;

    public a(Redirect redirect, String baseUrl, Set queryParameters) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        this.f147074a = redirect;
        this.f147075b = baseUrl;
        this.f147076c = queryParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f147074a, aVar.f147074a) && Intrinsics.f(this.f147075b, aVar.f147075b) && Intrinsics.f(this.f147076c, aVar.f147076c);
    }

    public final int hashCode() {
        return this.f147076c.hashCode() + p.a.c(this.f147074a.hashCode() * 31, 31, this.f147075b);
    }
}
