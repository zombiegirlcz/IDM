package com.youTransactor.uCube.rpc;

import java.util.Comparator;

/* JADX INFO: loaded from: classes17.dex */
public class Currency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107611c;

    public static class ByLabelComparator implements Comparator<Currency> {
        @Override // java.util.Comparator
        public int compare(Currency currency, Currency currency2) {
            return currency.f107609a.compareTo(currency2.f107609a);
        }
    }

    public Currency(int i, int i2, String str) {
        this.f107610b = i;
        this.f107611c = i2;
        this.f107609a = str;
    }

    public int getCode() {
        return this.f107610b;
    }

    public int getExponent() {
        return this.f107611c;
    }

    public String getLabel() {
        return this.f107609a;
    }
}
