package org.jmrtd.cert;

import a0.d;
import java.io.Serializable;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.data.Country;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public class CVCPrincipal implements Principal, Serializable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -4905647207367309688L;
    private Country country;
    private String mnemonic;
    private String seqNumber;

    public CVCPrincipal(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Name should be <Country (2F)><Mnemonic (9V)><SeqNum (5F)> formatted, found null");
        }
        if (str.length() < 7 || str.length() > 16) {
            throw new IllegalArgumentException(a.p("Name should be <Country (2F)><Mnemonic (9V)><SeqNum (5F)> formatted, found \"", str, "\""));
        }
        final String upperCase = str.substring(0, 2).toUpperCase();
        try {
            this.country = Country.getInstance(upperCase);
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.FINE, "Could not find country for " + upperCase, (Throwable) e);
            this.country = new Country() { // from class: org.jmrtd.cert.CVCPrincipal.1
                private static final long serialVersionUID = 345841304964161797L;

                @Override // net.sf.scuba.data.Country
                public String getName() {
                    return "Unknown";
                }

                @Override // net.sf.scuba.data.Country
                public String getNationality() {
                    return "Unknown";
                }

                @Override // net.sf.scuba.data.Country
                public String toAlpha2Code() {
                    return upperCase;
                }

                @Override // net.sf.scuba.data.Country
                public String toAlpha3Code() {
                    return "XXX";
                }

                @Override // net.sf.scuba.data.Country
                public int valueOf() {
                    return -1;
                }
            };
        }
        this.mnemonic = d.o(str, 5, 2);
        this.seqNumber = str.substring(str.length() - 5, str.length());
    }

    @Override // java.security.Principal
    public boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (!obj2.getClass().equals(getClass())) {
            return false;
        }
        CVCPrincipal cVCPrincipal = (CVCPrincipal) obj2;
        return cVCPrincipal.country.equals(this.country) && cVCPrincipal.mnemonic.equals(this.mnemonic) && cVCPrincipal.seqNumber.equals(this.seqNumber);
    }

    public Country getCountry() {
        return this.country;
    }

    public String getMnemonic() {
        return this.mnemonic;
    }

    @Override // java.security.Principal
    public String getName() {
        return this.country.toAlpha2Code() + this.mnemonic + this.seqNumber;
    }

    public String getSeqNumber() {
        return this.seqNumber;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return (getName().hashCode() * 2) + 1231211;
    }

    @Override // java.security.Principal
    public String toString() {
        return this.country.toAlpha2Code() + "/" + this.mnemonic + "/" + this.seqNumber;
    }

    public CVCPrincipal(Country country, String str, String str2) {
        if (str != null && str.length() <= 9) {
            if (str2 != null && str2.length() == 5) {
                this.country = country;
                this.mnemonic = str;
                this.seqNumber = str2;
                return;
            }
            throw new IllegalArgumentException("Wrong length seqNumber");
        }
        throw new IllegalArgumentException("Wrong length mnemonic");
    }
}
