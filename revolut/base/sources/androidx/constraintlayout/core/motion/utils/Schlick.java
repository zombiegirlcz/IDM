package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes15.dex */
public class Schlick extends Easing {
    double mS;
    double mT;

    public Schlick(String str) {
        this.mStr = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.mS = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double dfunc(double d) {
        double d5 = this.mT;
        if (d < d5) {
            double d6 = this.mS;
            return ((d6 * d5) * d5) / ((((d5 - d) * d6) + d) * (((d5 - d) * d6) + d));
        }
        double d10 = this.mS;
        return ((d5 - 1.0d) * ((d5 - 1.0d) * d10)) / (((((d5 - d) * (-d10)) - d) + 1.0d) * ((((d5 - d) * (-d10)) - d) + 1.0d));
    }

    private double func(double d) {
        double d5 = this.mT;
        if (d < d5) {
            return (d5 * d) / (((d5 - d) * this.mS) + d);
        }
        return ((d - 1.0d) * (1.0d - d5)) / ((1.0d - d) - ((d5 - d) * this.mS));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        return func(d);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        return dfunc(d);
    }
}
