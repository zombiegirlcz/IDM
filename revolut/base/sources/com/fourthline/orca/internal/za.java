package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35551a;

    public za(boolean z) {
        this.f35551a = z;
    }

    public final boolean a() {
        return this.f35551a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof za) && this.f35551a == ((za) obj2).f35551a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f35551a);
    }

    public String toString() {
        return "ComposeUiFeatureConfig(backButtonOnTopEnabled=" + this.f35551a + ")";
    }
}
