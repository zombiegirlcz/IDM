package sll;

import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import mx0.f9;
import mx0.g9;
import mx0.h9;
import mx0.i9;
import mx0.j9;
import mx0.k9;
import mx0.l9;
import mx0.m9;
import mx0.n9;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        int i;
        n9 n9Var = (n9) obj2;
        int i2 = 7;
        if (n9Var instanceof f9) {
            i = 0;
        } else if (n9Var instanceof g9) {
            i = 1;
        } else if (n9Var instanceof m9) {
            i = 2;
        } else if (n9Var instanceof h9) {
            i = 3;
        } else if (n9Var instanceof k9) {
            i = 4;
        } else if (n9Var instanceof j9) {
            i = 5;
        } else if (n9Var instanceof i9) {
            i = 6;
        } else {
            if (!(n9Var instanceof l9)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 7;
        }
        Integer numValueOf = Integer.valueOf(i);
        n9 n9Var2 = (n9) obj3;
        if (n9Var2 instanceof f9) {
            i2 = 0;
        } else if (n9Var2 instanceof g9) {
            i2 = 1;
        } else if (n9Var2 instanceof m9) {
            i2 = 2;
        } else if (n9Var2 instanceof h9) {
            i2 = 3;
        } else if (n9Var2 instanceof k9) {
            i2 = 4;
        } else if (n9Var2 instanceof j9) {
            i2 = 5;
        } else if (n9Var2 instanceof i9) {
            i2 = 6;
        } else if (!(n9Var2 instanceof l9)) {
            throw new NoWhenBranchMatchedException();
        }
        return cim.b.b(numValueOf, Integer.valueOf(i2));
    }
}
