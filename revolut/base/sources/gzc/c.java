package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f147988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147990c;

    public c(d answerType, String answer, String questionType) {
        Intrinsics.checkNotNullParameter(answerType, "answerType");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(questionType, "questionType");
        this.f147988a = answerType;
        this.f147989b = answer;
        this.f147990c = questionType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f147988a == cVar.f147988a && Intrinsics.f(this.f147989b, cVar.f147989b) && Intrinsics.f(this.f147990c, cVar.f147990c);
    }

    public final int hashCode() {
        return this.f147990c.hashCode() + p.a.c(this.f147988a.hashCode() * 31, 31, this.f147989b);
    }
}
